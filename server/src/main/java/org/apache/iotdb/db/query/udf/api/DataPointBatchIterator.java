/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iotdb.db.query.udf.api;

import java.io.IOException;
import org.apache.iotdb.tsfile.utils.Binary;

public interface DataPointBatchIterator extends Iterator {

  boolean hasNextBatch();

  void next() throws IOException;

  int currentBatchIndex();

  DataPointIterator currentBatch();

  int currentBatchSize();

  long getTimeInCurrentBatch(int index) throws IOException;

  int getIntInCurrentBatch(int index) throws IOException;

  long getLongInCurrentBatch(int index) throws IOException;

  boolean getBooleanInCurrentBatch(int index) throws IOException;

  float getFloatInCurrentBatch(int index) throws IOException;

  double getDoubleInCurrentBatch(int index) throws IOException;

  Binary getBinaryInCurrentBatch(int index) throws IOException;

  String getStringInCurrentBatch(int index) throws IOException;

  void reset();
}