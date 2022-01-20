var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":86,"id":8671,"methods":[{"el":46,"sc":5,"sl":44},{"el":53,"sc":5,"sl":51},{"el":64,"sc":5,"sl":61},{"el":74,"sc":5,"sl":71},{"el":84,"sc":5,"sl":81}],"name":"BrokenOutputStream","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1589":{"methods":[{"sl":81}],"name":"testClose","pass":true,"statements":[{"sl":83}]},"test_50":{"methods":[{"sl":71}],"name":"testFlush","pass":true,"statements":[{"sl":73}]},"test_864":{"methods":[{"sl":44},{"sl":61},{"sl":71},{"sl":81}],"name":"testBrokenStream","pass":true,"statements":[{"sl":45},{"sl":63},{"sl":73},{"sl":83}]},"test_937":{"methods":[{"sl":61}],"name":"testWrite","pass":true,"statements":[{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [864], [864], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [864, 937], [], [864, 937], [], [], [], [], [], [], [], [864, 50], [], [864, 50], [], [], [], [], [], [], [], [864, 1589], [], [864, 1589], [], [], []]
