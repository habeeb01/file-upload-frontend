package uk.gov.hmrc.fileupload.support

import play.api.libs.json.Json
import play.api.libs.json.Json._

trait Support {

  def prettify(json: String) = {
    prettyPrint( Json.parse(json) )
  }

}
