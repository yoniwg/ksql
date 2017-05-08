/**
 * Copyright 2017 Confluent Inc.
 **/

package io.confluent.ksql.function.udf.math;

import io.confluent.ksql.function.KSQLFunctionException;
import io.confluent.ksql.function.udf.KUDF;

public class CeilKUDF implements KUDF {

  @Override
  public void init() {
  }

  @Override
  public Object evaluate(Object... args) {
    if (args.length != 1) {
      throw new KSQLFunctionException("Ceil udf should have one input argument.");
    }
    return Math.ceil((Double) args[0]);
  }
}
