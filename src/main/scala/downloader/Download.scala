package downloader

import java.io.File
import java.net.URL
import scala.language.postfixOps
import scala.sys.process._

import downloader.URL._
object Download {

  def fileDownloader(url: String, filename: String): Unit = {
    new URL(url) #> new File(filename) !!
  }

  def downloadTrainingFile(): Unit = {
    val filename = trainigURL.split("/").last
    fileDownloader(trainigURL, filename)
  }

  def downloadTestFile(): Unit = {
    val filename = testURL.split("/").last
    fileDownloader(testURL, filename)
  }

  def downloadValidationFile(): Unit = {
    val filename = validationURL.split("/").last
    fileDownloader(validationURL, filename)
  }

  def downloadLiveFile(): Unit = {
    val filename = liveURL.split("/").last
    fileDownloader(liveURL, filename)
  }

}
