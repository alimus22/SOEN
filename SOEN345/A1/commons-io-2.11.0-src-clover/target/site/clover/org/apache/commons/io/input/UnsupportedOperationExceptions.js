var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":7527,"methods":[{"el":39,"sc":5,"sl":36},{"el":49,"sc":5,"sl":47},{"el":59,"sc":5,"sl":56}],"name":"UnsupportedOperationExceptions","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_286":{"methods":[{"sl":36},{"sl":47},{"sl":56}],"name":"testMarkNotSupported","pass":true,"statements":[{"sl":38},{"sl":48},{"sl":58}]},"test_320":{"methods":[{"sl":47},{"sl":56}],"name":"resetThrowsExceptionWhenUnderylingDoesNotSupport","pass":true,"statements":[{"sl":48},{"sl":58}]},"test_371":{"methods":[{"sl":36},{"sl":47},{"sl":56}],"name":"testMarkNotSupported","pass":true,"statements":[{"sl":38},{"sl":48},{"sl":58}]},"test_491":{"methods":[{"sl":47}],"name":"testReadLine","pass":true,"statements":[{"sl":48}]},"test_902":{"methods":[{"sl":47},{"sl":56}],"name":"resetThrowsExceptionWhenUnderylingSupports","pass":true,"statements":[{"sl":48},{"sl":58}]},"test_983":{"methods":[{"sl":47}],"name":"testReadUTF","pass":true,"statements":[{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [286, 371], [], [286, 371], [], [], [], [], [], [], [], [], [286, 320, 491, 983, 371, 902], [286, 320, 491, 983, 371, 902], [], [], [], [], [], [], [], [286, 320, 371, 902], [], [286, 320, 371, 902], [], []]
