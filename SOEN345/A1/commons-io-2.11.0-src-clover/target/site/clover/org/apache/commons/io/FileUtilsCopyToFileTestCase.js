var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":100,"id":11538,"methods":[{"el":50,"sc":5,"sl":41},{"el":65,"sc":5,"sl":59},{"el":80,"sc":5,"sl":74}],"name":"FileUtilsCopyToFileTestCase","sl":32},{"el":99,"id":11555,"methods":[{"el":88,"sc":9,"sl":85},{"el":94,"sc":9,"sl":90},{"el":98,"sc":9,"sl":96}],"name":"FileUtilsCopyToFileTestCase.CheckingInputStream","sl":82}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1000":{"methods":[{"sl":59},{"sl":85},{"sl":90},{"sl":96}],"name":"testCopyToFile","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":86},{"sl":87},{"sl":92},{"sl":93},{"sl":97}]},"test_1071":{"methods":[{"sl":74},{"sl":85},{"sl":90},{"sl":96}],"name":"testCopyInputStreamToFile","pass":true,"statements":[{"sl":76},{"sl":77},{"sl":78},{"sl":86},{"sl":87},{"sl":92},{"sl":93},{"sl":97}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1000], [], [1000], [1000], [1000], [], [], [], [], [], [], [], [], [], [], [1071], [], [1071], [1071], [1071], [], [], [], [], [], [], [1071, 1000], [1071, 1000], [1071, 1000], [], [], [1071, 1000], [], [1071, 1000], [1071, 1000], [], [], [1071, 1000], [1071, 1000], [], [], []]
