var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":8786,"methods":[{"el":49,"sc":5,"sl":46},{"el":59,"sc":5,"sl":56},{"el":64,"sc":5,"sl":61}],"name":"ClosedWriter","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1087":{"methods":[{"sl":56},{"sl":61}],"name":"testFlush","pass":true,"statements":[{"sl":58}]},"test_1621":{"methods":[{"sl":61}],"name":"testOtherException","pass":true,"statements":[]},"test_193":{"methods":[{"sl":46},{"sl":61}],"name":"testWrite","pass":true,"statements":[{"sl":48}]},"test_938":{"methods":[{"sl":46}],"name":"testClose","pass":true,"statements":[{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [193, 938], [], [193, 938], [], [], [], [], [], [], [], [1087], [], [1087], [], [], [1087, 1621, 193], [], [], [], []]
