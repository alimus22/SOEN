var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":27713,"methods":[{"el":36,"sc":5,"sl":33},{"el":43,"sc":5,"sl":41},{"el":49,"sc":5,"sl":46}],"name":"ThrowOnCloseReader","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":41},{"sl":46}],"name":"testNoopIOConsumer","pass":true,"statements":[{"sl":42},{"sl":48}]},"test_1336":{"methods":[{"sl":33},{"sl":46}],"name":"testCloseMainIOException","pass":true,"statements":[{"sl":35},{"sl":48}]},"test_1508":{"methods":[{"sl":41},{"sl":46}],"name":"testClose","pass":true,"statements":[{"sl":42},{"sl":48}]},"test_666":{"methods":[{"sl":41},{"sl":46}],"name":"testCloseConsumer","pass":true,"statements":[{"sl":42},{"sl":48}]},"test_942":{"methods":[{"sl":41},{"sl":46}],"name":"testCloseMulti","pass":true,"statements":[{"sl":42},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1336], [], [1336], [], [], [], [], [], [942, 666, 1508, 103], [942, 666, 1508, 103], [], [], [], [942, 666, 1508, 103, 1336], [], [942, 666, 1508, 103, 1336], [], [], []]
