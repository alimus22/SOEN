var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":27707,"methods":[{"el":35,"sc":5,"sl":33},{"el":42,"sc":5,"sl":40},{"el":48,"sc":5,"sl":45}],"name":"ThrowOnCloseOutputStream","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1415":{"methods":[{"sl":33},{"sl":45}],"name":"testIOExceptionOnClose","pass":true,"statements":[{"sl":34},{"sl":47}]},"test_1483":{"methods":[{"sl":33},{"sl":45}],"name":"testCloseBranchIOException","pass":true,"statements":[{"sl":34},{"sl":47}]},"test_827":{"methods":[{"sl":33},{"sl":45}],"name":"testIOExceptionOnCloseBranch","pass":true,"statements":[{"sl":34},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1483, 827, 1415], [1483, 827, 1415], [], [], [], [], [], [], [], [], [], [], [1483, 827, 1415], [], [1483, 827, 1415], [], [], []]
