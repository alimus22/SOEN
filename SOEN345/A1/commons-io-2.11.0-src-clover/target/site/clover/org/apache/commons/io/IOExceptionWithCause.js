var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":2500,"methods":[{"el":50,"sc":5,"sl":48},{"el":64,"sc":5,"sl":62}],"name":"IOExceptionWithCause","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1164":{"methods":[{"sl":48}],"name":"testOtherException","pass":true,"statements":[{"sl":49}]},"test_1258":{"methods":[{"sl":48}],"name":"testBrokenReader","pass":true,"statements":[{"sl":49}]},"test_1548":{"methods":[{"sl":48}],"name":"testBrokenStream","pass":true,"statements":[{"sl":49}]},"test_1621":{"methods":[{"sl":48}],"name":"testOtherException","pass":true,"statements":[{"sl":49}]},"test_1770":{"methods":[{"sl":48}],"name":"testBrokenWriter","pass":true,"statements":[{"sl":49}]},"test_239":{"methods":[{"sl":48}],"name":"testOtherException","pass":true,"statements":[{"sl":49}]},"test_248":{"methods":[{"sl":48}],"name":"testOtherException","pass":true,"statements":[{"sl":49}]},"test_766":{"methods":[{"sl":48}],"name":"testTaggedIOException","pass":true,"statements":[{"sl":49}]},"test_864":{"methods":[{"sl":48}],"name":"testBrokenStream","pass":true,"statements":[{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [766, 248, 1164, 1258, 1548, 1621, 864, 1770, 239], [766, 248, 1164, 1258, 1548, 1621, 864, 1770, 239], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
