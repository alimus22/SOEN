var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":58,"id":6034,"methods":[{"el":51,"sc":5,"sl":48},{"el":56,"sc":5,"sl":53}],"name":"ClosedReader","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1164":{"methods":[{"sl":53}],"name":"testOtherException","pass":true,"statements":[]},"test_1722":{"methods":[{"sl":48},{"sl":53}],"name":"testEmptyReader","pass":true,"statements":[{"sl":50}]},"test_738":{"methods":[{"sl":48}],"name":"testClose","pass":true,"statements":[{"sl":50}]},"test_797":{"methods":[{"sl":48},{"sl":53}],"name":"testRead","pass":true,"statements":[{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [738, 1722, 797], [], [738, 1722, 797], [], [], [1164, 1722, 797], [], [], [], [], []]
