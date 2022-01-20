var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":9884,"methods":[{"el":30,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":40,"sc":5,"sl":37},{"el":45,"sc":5,"sl":42}],"name":"ByteOrderParserTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1213":{"methods":[{"sl":28},{"sl":32}],"name":"testParseBig","pass":true,"statements":[{"sl":29},{"sl":34}]},"test_1324":{"methods":[{"sl":28},{"sl":42}],"name":"testThrowsException","pass":true,"statements":[{"sl":29},{"sl":44}]},"test_955":{"methods":[{"sl":28},{"sl":37}],"name":"testParseLittle","pass":true,"statements":[{"sl":29},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [955, 1213, 1324], [955, 1213, 1324], [], [], [1213], [], [1213], [], [], [955], [], [955], [], [], [1324], [], [1324], [], []]
