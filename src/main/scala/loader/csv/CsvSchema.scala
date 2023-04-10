package loader.csv
import org.apache.spark.sql.types.{StructType,StructField,StringType,IntegerType,LongType}

case class IcaoIata (structType: StructType) {

  val icaoIataSchema: StructType = structType
    .add ("country_code",StringType,false)
    .add ("region_name",StringType,true)
    .add ("iata",StringType,false)
    .add ("icao",StringType,false)
    .add ("airport ",StringType,false)
    .add ("latitude",LongType,true)
    .add ("longitude",LongType,true)

  def ifEvolitif : Boolean = ???
}
