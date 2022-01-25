var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":6083,"methods":[{"el":46,"sc":5,"sl":44},{"el":52,"sc":5,"sl":48},{"el":57,"sc":5,"sl":54},{"el":63,"sc":5,"sl":59}],"name":"MarkShieldInputStream","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1491":{"methods":[{"sl":44},{"sl":54}],"name":"markSupportedIsFalseWhenUnderlyingFalse","pass":true,"statements":[{"sl":45},{"sl":56}]},"test_238":{"methods":[{"sl":44},{"sl":54}],"name":"markSupportedIsFalseWhenUnderlyingTrue","pass":true,"statements":[{"sl":45},{"sl":56}]},"test_320":{"methods":[{"sl":44},{"sl":59}],"name":"resetThrowsExceptionWhenUnderylingDoesNotSupport","pass":true,"statements":[{"sl":45},{"sl":62}]},"test_418":{"methods":[{"sl":44},{"sl":48}],"name":"markIsNoOpWhenUnderlyingDoesNotSupport","pass":true,"statements":[{"sl":45}]},"test_902":{"methods":[{"sl":44},{"sl":59}],"name":"resetThrowsExceptionWhenUnderylingSupports","pass":true,"statements":[{"sl":45},{"sl":62}]},"test_976":{"methods":[{"sl":44},{"sl":48}],"name":"markIsNoOpWhenUnderlyingSupports","pass":true,"statements":[{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [238, 976, 1491, 418, 320, 902], [238, 976, 1491, 418, 320, 902], [], [], [976, 418], [], [], [], [], [], [238, 1491], [], [238, 1491], [], [], [320, 902], [], [], [320, 902], [], []]
