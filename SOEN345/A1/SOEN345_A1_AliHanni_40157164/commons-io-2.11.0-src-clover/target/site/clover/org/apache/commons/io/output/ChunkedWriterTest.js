var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":25707,"methods":[{"el":39,"sc":5,"sl":29},{"el":51,"sc":5,"sl":41},{"el":60,"sc":13,"sl":56},{"el":62,"sc":5,"sl":53},{"el":68,"sc":5,"sl":64}],"name":"ChunkedWriterTest","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1173":{"methods":[{"sl":29},{"sl":53},{"sl":56}],"name":"write_four_chunks","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":54},{"sl":55},{"sl":58},{"sl":59}]},"test_1559":{"methods":[{"sl":64}],"name":"negative_chunksize_not_permitted","pass":true,"statements":[{"sl":66}]},"test_1740":{"methods":[{"sl":41},{"sl":53},{"sl":56}],"name":"write_two_chunks_default_constructor","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":54},{"sl":55},{"sl":58},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1173], [], [1173], [1173], [1173], [1173], [1173], [1173], [], [], [], [], [1740], [], [1740], [1740], [1740], [1740], [1740], [1740], [], [], [], [], [1740, 1173], [1740, 1173], [1740, 1173], [1740, 1173], [], [1740, 1173], [1740, 1173], [], [], [], [], [1559], [], [1559], [], [], []]
