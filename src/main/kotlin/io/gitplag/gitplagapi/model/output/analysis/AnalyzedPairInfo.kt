package io.gitplag.gitplagapi.model.output.analysis

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import java.time.LocalDateTime

data class AnalyzedPairInfo(
    @JsonProperty(value = "id", required = true)
    val id: Long,
    @JsonProperty(value = "student1", required = true)
    val student1: String,
    @JsonProperty(value = "student2", required = true)
    val student2: String,
    @JsonProperty(value = "percentage", required = true)
    val percentage: Int,
    @JsonProperty(value = "minPercentage", required = true)
    val minPercentage: Int,
    @JsonProperty(value = "maxPercentage", required = true)
    val maxPercentage: Int,
    @JsonProperty(value = "createdAt1", required = true)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    val createdAt1: LocalDateTime,
    @JsonProperty(value = "createdAt2", required = true)
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    val createdAt2: LocalDateTime
)