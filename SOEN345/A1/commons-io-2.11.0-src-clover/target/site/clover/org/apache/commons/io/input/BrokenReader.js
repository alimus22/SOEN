var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":123,"id":5622,"methods":[{"el":46,"sc":5,"sl":44},{"el":53,"sc":5,"sl":51},{"el":67,"sc":5,"sl":64},{"el":79,"sc":5,"sl":76},{"el":90,"sc":5,"sl":87},{"el":101,"sc":5,"sl":98},{"el":111,"sc":5,"sl":108},{"el":121,"sc":5,"sl":118}],"name":"BrokenReader","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1084":{"methods":[{"sl":98}],"name":"testMark","pass":true,"statements":[{"sl":100}]},"test_1258":{"methods":[{"sl":44},{"sl":64},{"sl":87},{"sl":118}],"name":"testBrokenReader","pass":true,"statements":[{"sl":45},{"sl":66},{"sl":89},{"sl":120}]},"test_1535":{"methods":[{"sl":108}],"name":"testReset","pass":true,"statements":[{"sl":110}]},"test_305":{"methods":[{"sl":64}],"name":"testRead","pass":true,"statements":[{"sl":66}]},"test_470":{"methods":[{"sl":118}],"name":"testClose","pass":true,"statements":[{"sl":120}]},"test_553":{"methods":[{"sl":87}],"name":"testReady","pass":true,"statements":[{"sl":89}]},"test_832":{"methods":[{"sl":76}],"name":"testSkip","pass":true,"statements":[{"sl":78}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1258], [1258], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1258, 305], [], [1258, 305], [], [], [], [], [], [], [], [], [], [832], [], [832], [], [], [], [], [], [], [], [], [1258, 553], [], [1258, 553], [], [], [], [], [], [], [], [], [1084], [], [1084], [], [], [], [], [], [], [], [1535], [], [1535], [], [], [], [], [], [], [], [1258, 470], [], [1258, 470], [], [], []]
