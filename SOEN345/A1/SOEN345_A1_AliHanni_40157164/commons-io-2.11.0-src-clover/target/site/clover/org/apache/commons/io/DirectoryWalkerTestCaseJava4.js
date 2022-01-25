var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":535,"id":10314,"methods":[{"el":85,"sc":5,"sl":77},{"el":95,"sc":5,"sl":90},{"el":106,"sc":5,"sl":100},{"el":119,"sc":5,"sl":111},{"el":131,"sc":5,"sl":124},{"el":143,"sc":5,"sl":136},{"el":155,"sc":5,"sl":148},{"el":167,"sc":5,"sl":160},{"el":179,"sc":5,"sl":172},{"el":189,"sc":5,"sl":184},{"el":209,"sc":5,"sl":194},{"el":220,"sc":5,"sl":214},{"el":231,"sc":5,"sl":227},{"el":244,"sc":5,"sl":236},{"el":257,"sc":5,"sl":249},{"el":269,"sc":5,"sl":263},{"el":303,"sc":5,"sl":275},{"el":340,"sc":5,"sl":309}],"name":"DirectoryWalkerTestCaseJava4","sl":43},{"el":386,"id":10447,"methods":[{"el":352,"sc":9,"sl":350},{"el":356,"sc":9,"sl":354},{"el":369,"sc":9,"sl":361},{"el":377,"sc":9,"sl":374},{"el":385,"sc":9,"sl":382}],"name":"DirectoryWalkerTestCaseJava4.TestFileFinder","sl":348},{"el":407,"id":10461,"methods":[{"el":398,"sc":9,"sl":396},{"el":406,"sc":9,"sl":403}],"name":"DirectoryWalkerTestCaseJava4.TestFalseFileFinder","sl":394},{"el":465,"id":10465,"methods":[{"el":422,"sc":9,"sl":419},{"el":431,"sc":9,"sl":427},{"el":442,"sc":9,"sl":436},{"el":453,"sc":9,"sl":447},{"el":464,"sc":9,"sl":458}],"name":"DirectoryWalkerTestCaseJava4.TestCancelWalker","sl":415},{"el":533,"id":10489,"methods":[{"el":480,"sc":9,"sl":477},{"el":489,"sc":9,"sl":485},{"el":501,"sc":9,"sl":494},{"el":513,"sc":9,"sl":506},{"el":521,"sc":9,"sl":518},{"el":532,"sc":9,"sl":526}],"name":"DirectoryWalkerTestCaseJava4.TestMultiThreadCancelWalker","sl":471}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":194},{"sl":350},{"sl":361},{"sl":374}],"name":"testMissingStartDirectory","pass":true,"statements":[{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":203},{"sl":204},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376}]},"test_116":{"methods":[{"sl":148},{"sl":227},{"sl":354},{"sl":361},{"sl":374},{"sl":382}],"name":"testFilterDirAndFile2","pass":true,"statements":[{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":228},{"sl":229},{"sl":355},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376},{"sl":384}]},"test_1194":{"methods":[{"sl":90},{"sl":350},{"sl":361},{"sl":374}],"name":"testFilterAndLimitA","pass":true,"statements":[{"sl":92},{"sl":93},{"sl":94},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376}]},"test_152":{"methods":[{"sl":309},{"sl":477},{"sl":485},{"sl":494},{"sl":506},{"sl":518},{"sl":526}],"name":"testMultiThreadCancel","pass":true,"statements":[{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":318},{"sl":319},{"sl":320},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":330},{"sl":331},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":478},{"sl":479},{"sl":486},{"sl":487},{"sl":488},{"sl":496},{"sl":497},{"sl":498},{"sl":499},{"sl":508},{"sl":509},{"sl":510},{"sl":511},{"sl":520},{"sl":529},{"sl":530}]},"test_1523":{"methods":[{"sl":77},{"sl":227},{"sl":350},{"sl":361},{"sl":374},{"sl":382}],"name":"testFilter","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":228},{"sl":229},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376},{"sl":384}]},"test_1715":{"methods":[{"sl":172},{"sl":227},{"sl":249},{"sl":354},{"sl":361},{"sl":374},{"sl":382}],"name":"testFilterDirAndFile4","pass":true,"statements":[{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":228},{"sl":229},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":256},{"sl":355},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376},{"sl":384}]},"test_1750":{"methods":[{"sl":160},{"sl":227},{"sl":236},{"sl":354},{"sl":361},{"sl":374},{"sl":382}],"name":"testFilterDirAndFile3","pass":true,"statements":[{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":228},{"sl":229},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":243},{"sl":355},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376},{"sl":384}]},"test_1850":{"methods":[{"sl":275},{"sl":419},{"sl":427},{"sl":436},{"sl":447},{"sl":458}],"name":"testCancel","pass":true,"statements":[{"sl":277},{"sl":280},{"sl":281},{"sl":282},{"sl":285},{"sl":286},{"sl":290},{"sl":291},{"sl":292},{"sl":295},{"sl":296},{"sl":300},{"sl":301},{"sl":302},{"sl":420},{"sl":421},{"sl":428},{"sl":429},{"sl":430},{"sl":438},{"sl":439},{"sl":440},{"sl":449},{"sl":450},{"sl":451},{"sl":461},{"sl":462}]},"test_265":{"methods":[{"sl":214},{"sl":350},{"sl":361},{"sl":396},{"sl":403}],"name":"testHandleStartDirectoryFalse","pass":true,"statements":[{"sl":217},{"sl":218},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":397},{"sl":405}]},"test_289":{"methods":[{"sl":184},{"sl":350},{"sl":361},{"sl":374}],"name":"testLimitToCurrent","pass":true,"statements":[{"sl":186},{"sl":187},{"sl":188},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376}]},"test_399":{"methods":[{"sl":100},{"sl":350},{"sl":361},{"sl":374}],"name":"testFilterAndLimitB","pass":true,"statements":[{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376}]},"test_699":{"methods":[{"sl":124},{"sl":227},{"sl":350},{"sl":361},{"sl":374},{"sl":382}],"name":"testFilterAndLimitD","pass":true,"statements":[{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":228},{"sl":229},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376},{"sl":384}]},"test_871":{"methods":[{"sl":111},{"sl":350},{"sl":361},{"sl":374}],"name":"testFilterAndLimitC","pass":true,"statements":[{"sl":113},{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":351},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376}]},"test_96":{"methods":[{"sl":136},{"sl":227},{"sl":354},{"sl":361},{"sl":374},{"sl":382}],"name":"testFilterDirAndFile1","pass":true,"statements":[{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":228},{"sl":229},{"sl":355},{"sl":362},{"sl":363},{"sl":364},{"sl":368},{"sl":376},{"sl":384}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1523], [], [1523], [1523], [1523], [1523], [1523], [1523], [], [], [], [], [], [1194], [], [1194], [1194], [1194], [], [], [], [], [], [399], [], [399], [399], [399], [399], [], [], [], [], [], [871], [], [871], [871], [871], [871], [871], [871], [], [], [], [], [], [699], [], [699], [699], [699], [699], [699], [], [], [], [], [], [96], [], [96], [96], [96], [96], [96], [], [], [], [], [], [116], [], [116], [116], [116], [116], [116], [], [], [], [], [], [1750], [], [1750], [1750], [1750], [1750], [1750], [], [], [], [], [], [1715], [], [1715], [1715], [1715], [1715], [1715], [], [], [], [], [], [289], [], [289], [289], [289], [], [], [], [], [], [102], [], [], [], [102], [102], [102], [102], [], [102], [102], [], [], [], [], [], [], [], [], [], [265], [], [], [265], [265], [], [], [], [], [], [], [], [], [1523, 116, 699, 1750, 96, 1715], [1523, 116, 699, 1750, 96, 1715], [1523, 116, 699, 1750, 96, 1715], [], [], [], [], [], [], [1750], [1750], [1750], [1750], [1750], [], [], [1750], [], [], [], [], [], [1715], [1715], [1715], [1715], [1715], [], [], [1715], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1850], [], [1850], [], [], [1850], [1850], [1850], [], [], [1850], [1850], [], [], [], [1850], [1850], [1850], [], [], [1850], [1850], [], [], [], [1850], [1850], [1850], [], [], [], [], [], [], [152], [], [152], [152], [], [152], [152], [], [], [152], [152], [152], [], [], [], [152], [152], [152], [152], [], [], [152], [152], [], [], [], [152], [152], [152], [152], [], [], [], [], [], [], [], [], [], [], [], [1523, 102, 699, 289, 399, 1194, 871, 265], [1523, 102, 699, 289, 399, 1194, 871, 265], [], [], [116, 1750, 96, 1715], [116, 1750, 96, 1715], [], [], [], [], [], [1523, 116, 102, 699, 1750, 289, 399, 96, 1194, 871, 265, 1715], [1523, 116, 102, 699, 1750, 289, 399, 96, 1194, 871, 265, 1715], [1523, 116, 102, 699, 1750, 289, 399, 96, 1194, 871, 265, 1715], [1523, 116, 102, 699, 1750, 289, 399, 96, 1194, 871, 265, 1715], [], [], [], [1523, 116, 102, 699, 1750, 289, 399, 96, 1194, 871, 265, 1715], [], [], [], [], [], [1523, 116, 102, 699, 1750, 289, 399, 96, 1194, 871, 1715], [], [1523, 116, 102, 699, 1750, 289, 399, 96, 1194, 871, 1715], [], [], [], [], [], [1523, 116, 699, 1750, 96, 1715], [], [1523, 116, 699, 1750, 96, 1715], [], [], [], [], [], [], [], [], [], [], [], [265], [265], [], [], [], [], [], [265], [], [265], [], [], [], [], [], [], [], [], [], [], [], [], [], [1850], [1850], [1850], [], [], [], [], [], [1850], [1850], [1850], [1850], [], [], [], [], [], [1850], [], [1850], [1850], [1850], [], [], [], [], [], [], [1850], [], [1850], [1850], [1850], [], [], [], [], [], [], [1850], [], [], [1850], [1850], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [152], [152], [152], [], [], [], [], [], [152], [152], [152], [152], [], [], [], [], [], [152], [], [152], [152], [152], [152], [], [], [], [], [], [], [152], [], [152], [152], [152], [152], [], [], [], [], [], [], [152], [], [152], [], [], [], [], [], [152], [], [], [152], [152], [], [], [], [], []]