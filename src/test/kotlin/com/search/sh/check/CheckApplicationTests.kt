package com.search.sh.check

import com.search.sh.check.es.document.Blog
import com.search.sh.check.es.repository.ElasticSearchRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CheckApplicationTests {

	@Autowired
	private lateinit var elasticSearchRepository: ElasticSearchRepository

	@Test
	fun contextLoads() {
	}

	@Test
	@DisplayName("elastic search 저장하기")
	fun startEs() {
		var blog: Blog = Blog()
		blog.id = "2"
		blog.title = "title :D"
		blog.content = "content :D"
		elasticSearchRepository.save(blog)
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
