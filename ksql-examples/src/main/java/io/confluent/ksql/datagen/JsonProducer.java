/**
 * Copyright 2017 Confluent Inc.
 **/
package io.confluent.ksql.datagen;

import io.confluent.ksql.physical.GenericRow;
import io.confluent.ksql.serde.json.KSQLJsonPOJOSerializer;
import org.apache.avro.Schema;
import org.apache.kafka.common.serialization.Serializer;

public class JsonProducer extends DataGenProducer {

  @Override
  protected Serializer<GenericRow> getSerializer(
      Schema avroSchema,
      org.apache.kafka.connect.data.Schema kafkaSchema,
      String topicName
  ) {
    return new KSQLJsonPOJOSerializer(kafkaSchema);
  }
}
