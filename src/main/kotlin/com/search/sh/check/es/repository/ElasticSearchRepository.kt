package com.search.sh.check.es.repository

import com.search.sh.check.es.document.Blog
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface ElasticSearchRepository: ElasticsearchRepository<Blog, String> {


}