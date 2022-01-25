var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":85,"id":8751,"methods":[{"el":55,"sc":5,"sl":49},{"el":63,"sc":5,"sl":61},{"el":83,"sc":5,"sl":73}],"name":"ChunkedWriter","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1173":{"methods":[{"sl":49},{"sl":73}],"name":"write_four_chunks","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":54},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81}]},"test_1559":{"methods":[{"sl":49}],"name":"negative_chunksize_not_permitted","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52}]},"test_1740":{"methods":[{"sl":49},{"sl":61},{"sl":73}],"name":"write_two_chunks_default_constructor","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":54},{"sl":62},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1740, 1559, 1173], [1740, 1559, 1173], [1740, 1559, 1173], [1559], [], [1740, 1173], [], [], [], [], [], [], [1740], [1740], [], [], [], [], [], [], [], [], [], [], [1740, 1173], [], [1740, 1173], [1740, 1173], [1740, 1173], [1740, 1173], [1740, 1173], [1740, 1173], [1740, 1173], [], [], [], []]
