var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":86,"id":9892,"methods":[{"el":46,"sc":5,"sl":35},{"el":51,"sc":5,"sl":48},{"el":59,"sc":5,"sl":53},{"el":64,"sc":5,"sl":61},{"el":69,"sc":5,"sl":66},{"el":74,"sc":5,"sl":71},{"el":79,"sc":5,"sl":76},{"el":84,"sc":5,"sl":81}],"name":"CharsetsTestCase","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1506":{"methods":[{"sl":61}],"name":"testUsAscii","pass":true,"statements":[{"sl":63}]},"test_1617":{"methods":[{"sl":35}],"name":"testRequiredCharsets","pass":true,"statements":[{"sl":37},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45}]},"test_1655":{"methods":[{"sl":48}],"name":"testIso8859_1","pass":true,"statements":[{"sl":50}]},"test_1745":{"methods":[{"sl":81}],"name":"testUtf8","pass":true,"statements":[{"sl":83}]},"test_1814":{"methods":[{"sl":76}],"name":"testUtf16Le","pass":true,"statements":[{"sl":78}]},"test_427":{"methods":[{"sl":71}],"name":"testUtf16Be","pass":true,"statements":[{"sl":73}]},"test_483":{"methods":[{"sl":66}],"name":"testUtf16","pass":true,"statements":[{"sl":68}]},"test_825":{"methods":[{"sl":53}],"name":"testToCharset","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1617], [], [1617], [], [], [1617], [1617], [1617], [1617], [1617], [1617], [], [], [1655], [], [1655], [], [], [825], [], [825], [825], [825], [825], [], [], [1506], [], [1506], [], [], [483], [], [483], [], [], [427], [], [427], [], [], [1814], [], [1814], [], [], [1745], [], [1745], [], [], []]
