var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":65,"methods":[{"el":33,"sc":5,"sl":32},{"el":64,"sc":5,"sl":55}],"name":"ByteOrderParser","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1213":{"methods":[{"sl":55}],"name":"testParseBig","pass":true,"statements":[{"sl":56},{"sl":57}]},"test_1324":{"methods":[{"sl":55}],"name":"testThrowsException","pass":true,"statements":[{"sl":56},{"sl":59},{"sl":62}]},"test_955":{"methods":[{"sl":55}],"name":"testParseLittle","pass":true,"statements":[{"sl":56},{"sl":59},{"sl":60}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1213, 955, 1324], [1213, 955, 1324], [1213], [], [955, 1324], [955], [], [1324], [], [], [], []]
