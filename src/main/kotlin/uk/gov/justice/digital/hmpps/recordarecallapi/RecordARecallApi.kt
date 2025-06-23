package uk.gov.justice.digital.hmpps.recordarecallapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecordARecallApi

fun main(args: Array<String>) {
  runApplication<RecordARecallApi>(*args)
}
