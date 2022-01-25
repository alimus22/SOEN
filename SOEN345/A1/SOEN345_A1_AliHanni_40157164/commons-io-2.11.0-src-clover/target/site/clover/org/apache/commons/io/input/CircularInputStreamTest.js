var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":110,"id":21575,"methods":[{"el":44,"sc":5,"sl":35},{"el":48,"sc":5,"sl":46},{"el":53,"sc":5,"sl":50},{"el":60,"sc":5,"sl":55},{"el":65,"sc":5,"sl":62},{"el":72,"sc":5,"sl":67},{"el":80,"sc":5,"sl":74},{"el":88,"sc":5,"sl":82},{"el":93,"sc":5,"sl":90},{"el":108,"sc":5,"sl":95}],"name":"CircularInputStreamTest","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1333":{"methods":[{"sl":35},{"sl":46},{"sl":95}],"name":"testWholeRangeOfBytes","pass":true,"statements":[{"sl":36},{"sl":38},{"sl":39},{"sl":41},{"sl":42},{"sl":47},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":105},{"sl":107}]},"test_1365":{"methods":[{"sl":46},{"sl":55}],"name":"testCount0","pass":true,"statements":[{"sl":47},{"sl":57},{"sl":58}]},"test_1476":{"methods":[{"sl":46},{"sl":90}],"name":"testNullInputSize0","pass":true,"statements":[{"sl":47},{"sl":92}]},"test_19":{"methods":[{"sl":46},{"sl":67}],"name":"testCount0InputSize1","pass":true,"statements":[{"sl":47},{"sl":69},{"sl":70}]},"test_424":{"methods":[{"sl":46},{"sl":62}],"name":"testCount0InputSize0","pass":true,"statements":[{"sl":47},{"sl":64}]},"test_458":{"methods":[{"sl":46},{"sl":50}],"name":"testContainsEofInputSize0","pass":true,"statements":[{"sl":47},{"sl":52}]},"test_839":{"methods":[{"sl":46},{"sl":74}],"name":"testCount1InputSize1","pass":true,"statements":[{"sl":47},{"sl":76},{"sl":77},{"sl":78}]},"test_888":{"methods":[{"sl":35},{"sl":46},{"sl":82}],"name":"testCycleBytes","pass":true,"statements":[{"sl":36},{"sl":38},{"sl":39},{"sl":41},{"sl":42},{"sl":47},{"sl":84},{"sl":85},{"sl":87}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1333, 888], [1333, 888], [], [1333, 888], [1333, 888], [], [1333, 888], [1333, 888], [], [], [], [1476, 839, 1333, 1365, 424, 888, 19, 458], [1476, 839, 1333, 1365, 424, 888, 19, 458], [], [], [458], [], [458], [], [], [1365], [], [1365], [1365], [], [], [], [424], [], [424], [], [], [19], [], [19], [19], [], [], [], [839], [], [839], [839], [839], [], [], [], [888], [], [888], [888], [], [888], [], [], [1476], [], [1476], [], [], [1333], [], [1333], [1333], [1333], [1333], [1333], [1333], [], [], [1333], [], [1333], [], [], []]