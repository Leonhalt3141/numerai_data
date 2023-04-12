package downloader

import com.typesafe.config.ConfigFactory

object URL {
  private val conf = ConfigFactory.load()
  private val public_datasets_url: String =
    conf.getString("PUBLIC_DATASETS_URL")

  val trainigURL: String =
    f"$public_datasets_url/latest_numerai_training_data.parquet"
  val testURL: String = f"$public_datasets_url/latest_numerai_test_data.parquet"
  val validationURL: String =
    f"$public_datasets_url/latest_numerai_validation_data.parquet"
  val liveURL: String = f"$public_datasets_url/latest_numerai_live_data.parquet"
}
