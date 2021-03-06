/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.core;

import junit.framework.TestCase;
import org.junit.Test;
import org.pentaho.di.core.row.RowMeta;

public class ConditionTest extends TestCase {

  @Test
  public void testNegatedTrueFuncEvaluatesAsFalse() throws Exception {
    String left = "test_filed";
    String right = "test_value";
    int func = Condition.FUNC_TRUE;
    boolean negate = true;

    Condition condition = new Condition( negate, left, func, right, null );
    assertFalse( condition.evaluate( new RowMeta(), new Object[]{ "test" } ) );
  }
}
