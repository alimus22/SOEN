var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":22359,"methods":[{"el":38,"sc":5,"sl":31},{"el":46,"sc":5,"sl":40}],"name":"ProxyReaderTest","sl":29},{"el":53,"id":22368,"methods":[{"el":52,"sc":9,"sl":50}],"name":"ProxyReaderTest.ProxyReaderImpl","sl":49},{"el":68,"id":22370,"methods":[{"el":59,"sc":9,"sl":57},{"el":63,"sc":9,"sl":60},{"el":67,"sc":9,"sl":64}],"name":"ProxyReaderTest.CustomNullReader","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_468":{"methods":[{"sl":31},{"sl":50},{"sl":57},{"sl":60}],"name":"testNullCharArray","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":51},{"sl":58},{"sl":62}]},"test_667":{"methods":[{"sl":40},{"sl":50},{"sl":57},{"sl":64}],"name":"testNullCharBuffer","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45},{"sl":51},{"sl":58},{"sl":66}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [468], [], [], [468], [468], [468], [468], [], [], [667], [], [], [667], [667], [667], [], [], [], [], [667, 468], [667, 468], [], [], [], [], [], [667, 468], [667, 468], [], [468], [], [468], [], [667], [], [667], [], [], []]
