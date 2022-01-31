package com.search.sh.check.es.document

import lombok.Data
import lombok.Setter
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import java.util.*

/*
    index Table
    @Entity 와 동일
 */
@Document(indexName = "blog")
@Setter
class Blog {
    @Id
    var id: String = "defaultId"

    var title: String = "defaultTitle"

    var content: String = "defaultContent"

    @Field(type = FieldType.Date)
    var log_date:Date = Date()

    @Field(type = FieldType.Text)
    var log_text:String? = null

    @Field(type = FieldType.Long)
    var price:Long = 0L

}