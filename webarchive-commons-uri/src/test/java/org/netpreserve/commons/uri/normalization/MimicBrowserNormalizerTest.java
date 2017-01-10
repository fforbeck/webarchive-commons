/*
 * Copyright 2016 The International Internet Preservation Consortium.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.netpreserve.commons.uri.normalization;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 *
 */
public class MimicBrowserNormalizerTest {

    @Test
    public void testExamples() {
        NormalizationTestUtil.testNormalizerExamples(new WhatwgPreTrimming());
    }

    /**
     * Test of normalize method, of class WhatwgPreParseNormalizer.
     */
    @Test
    public void testNormalize() {
        String uriString = " \tabc\ndef\u0003";
        WhatwgPreTrimming instance = new WhatwgPreTrimming();
        String expResult = "abcdef";
        String result = instance.normalize(uriString);
        assertThat(result).isEqualTo(expResult);
    }

}
