package com.search.sh.check

import com.search.sh.check.es.document.Blog
import com.search.sh.check.es.repository.ElasticSearchRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.random.Random

@SpringBootTest
class CheckApplicationTests {

	private val logger: Logger = LoggerFactory.getLogger(CheckApplicationTests::class.java)

	@Autowired
	private lateinit var elasticSearchRepository: ElasticSearchRepository

	@Test
	fun contextLoads() {
	}

	@Test
	@DisplayName("elastic search 저장하기")
	fun startEs() {
		var blog: Blog = Blog()
		val testId = (1..10).random().toString()
		blog.id = testId
		blog.title = "$testId 제목 :D"
		blog.content = "$testId 내용 :D"
		elasticSearchRepository.save(blog)

		logger.info("[save] blogId: '${blog.id}'")
	}

	@Test
	@DisplayName("조회")
	fun findById() {
		// 저장
		val savedBlog: Blog = Blog()
		savedBlog.id = "1"
		savedBlog.title = "title.."
		savedBlog.content = "content.."
		elasticSearchRepository.save(savedBlog)

		// 조회
		val searched = elasticSearchRepository.findById("1").orElseGet(null)

		// 테스트
		assertNotNull(searched)
		assertEquals(savedBlog.id, searched.id)
		assertEquals(savedBlog.title, searched.title)
		assertEquals(savedBlog.content, searched.content)
	}
}
