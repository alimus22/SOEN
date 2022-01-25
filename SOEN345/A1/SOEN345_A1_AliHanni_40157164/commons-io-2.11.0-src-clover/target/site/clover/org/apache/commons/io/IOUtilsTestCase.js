var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1722,"id":15552,"methods":[{"el":117,"sc":5,"sl":115},{"el":149,"sc":5,"sl":119},{"el":157,"sc":13,"sl":154},{"el":162,"sc":5,"sl":151},{"el":170,"sc":13,"sl":167},{"el":176,"sc":5,"sl":164},{"el":204,"sc":5,"sl":178},{"el":211,"sc":13,"sl":209},{"el":216,"sc":5,"sl":206},{"el":223,"sc":13,"sl":221},{"el":229,"sc":5,"sl":218},{"el":236,"sc":13,"sl":234},{"el":241,"sc":13,"sl":238},{"el":246,"sc":5,"sl":231},{"el":253,"sc":13,"sl":251},{"el":258,"sc":13,"sl":255},{"el":264,"sc":5,"sl":248},{"el":271,"sc":13,"sl":269},{"el":275,"sc":13,"sl":273},{"el":279,"sc":13,"sl":277},{"el":283,"sc":13,"sl":281},{"el":288,"sc":5,"sl":266},{"el":295,"sc":13,"sl":293},{"el":299,"sc":13,"sl":297},{"el":303,"sc":13,"sl":301},{"el":307,"sc":13,"sl":305},{"el":313,"sc":5,"sl":290},{"el":322,"sc":5,"sl":315},{"el":327,"sc":5,"sl":324},{"el":336,"sc":5,"sl":329},{"el":343,"sc":5,"sl":338},{"el":369,"sc":5,"sl":345},{"el":381,"sc":5,"sl":371},{"el":389,"sc":5,"sl":383},{"el":398,"sc":5,"sl":391},{"el":410,"sc":5,"sl":400},{"el":419,"sc":13,"sl":416},{"el":422,"sc":5,"sl":412},{"el":429,"sc":5,"sl":424},{"el":442,"sc":5,"sl":431},{"el":448,"sc":5,"sl":444},{"el":457,"sc":17,"sl":454},{"el":460,"sc":5,"sl":450},{"el":466,"sc":5,"sl":462},{"el":475,"sc":17,"sl":472},{"el":478,"sc":5,"sl":468},{"el":496,"sc":5,"sl":480},{"el":512,"sc":5,"sl":498},{"el":566,"sc":5,"sl":514},{"el":595,"sc":5,"sl":568},{"el":641,"sc":5,"sl":597},{"el":661,"sc":5,"sl":643},{"el":679,"sc":5,"sl":663},{"el":698,"sc":5,"sl":681},{"el":725,"sc":5,"sl":700},{"el":751,"sc":5,"sl":727},{"el":777,"sc":5,"sl":753},{"el":803,"sc":5,"sl":779},{"el":810,"sc":5,"sl":805},{"el":830,"sc":5,"sl":812},{"el":847,"sc":5,"sl":832},{"el":864,"sc":5,"sl":849},{"el":881,"sc":5,"sl":866},{"el":890,"sc":5,"sl":883},{"el":916,"sc":5,"sl":892},{"el":938,"sc":5,"sl":918},{"el":950,"sc":5,"sl":940},{"el":975,"sc":5,"sl":952},{"el":985,"sc":5,"sl":977},{"el":1012,"sc":5,"sl":987},{"el":1036,"sc":5,"sl":1014},{"el":1045,"sc":5,"sl":1038},{"el":1063,"sc":5,"sl":1047},{"el":1081,"sc":5,"sl":1065},{"el":1099,"sc":5,"sl":1083},{"el":1107,"sc":5,"sl":1101},{"el":1116,"sc":5,"sl":1109},{"el":1124,"sc":5,"sl":1118},{"el":1133,"sc":5,"sl":1126},{"el":1138,"sc":5,"sl":1135},{"el":1144,"sc":5,"sl":1140},{"el":1149,"sc":5,"sl":1146},{"el":1155,"sc":5,"sl":1151},{"el":1165,"sc":5,"sl":1157},{"el":1175,"sc":5,"sl":1167},{"el":1185,"sc":5,"sl":1177},{"el":1197,"sc":5,"sl":1189},{"el":1203,"sc":5,"sl":1199},{"el":1209,"sc":5,"sl":1205},{"el":1215,"sc":5,"sl":1211},{"el":1221,"sc":5,"sl":1217},{"el":1226,"sc":5,"sl":1223},{"el":1232,"sc":5,"sl":1228},{"el":1239,"sc":5,"sl":1234},{"el":1247,"sc":5,"sl":1241},{"el":1254,"sc":5,"sl":1249},{"el":1263,"sc":5,"sl":1256},{"el":1268,"sc":5,"sl":1265},{"el":1274,"sc":5,"sl":1270},{"el":1279,"sc":5,"sl":1276},{"el":1284,"sc":5,"sl":1281},{"el":1293,"sc":5,"sl":1286},{"el":1302,"sc":5,"sl":1295},{"el":1315,"sc":5,"sl":1304},{"el":1338,"sc":5,"sl":1317},{"el":1362,"sc":5,"sl":1340},{"el":1384,"sc":5,"sl":1364},{"el":1408,"sc":5,"sl":1386},{"el":1420,"sc":5,"sl":1410},{"el":1432,"sc":5,"sl":1422},{"el":1443,"sc":5,"sl":1434},{"el":1450,"sc":5,"sl":1445},{"el":1463,"sc":5,"sl":1452},{"el":1474,"sc":5,"sl":1465},{"el":1487,"sc":5,"sl":1476},{"el":1500,"sc":5,"sl":1489},{"el":1510,"sc":5,"sl":1502},{"el":1520,"sc":5,"sl":1512},{"el":1530,"sc":5,"sl":1522},{"el":1541,"sc":5,"sl":1532},{"el":1548,"sc":5,"sl":1543},{"el":1555,"sc":5,"sl":1550},{"el":1567,"sc":5,"sl":1557},{"el":1578,"sc":5,"sl":1569},{"el":1589,"sc":5,"sl":1580},{"el":1599,"sc":5,"sl":1591},{"el":1620,"sc":5,"sl":1608},{"el":1641,"sc":5,"sl":1629},{"el":1651,"sc":5,"sl":1643},{"el":1661,"sc":5,"sl":1653},{"el":1670,"sc":5,"sl":1663},{"el":1678,"sc":5,"sl":1672},{"el":1685,"sc":5,"sl":1680},{"el":1690,"sc":5,"sl":1687},{"el":1695,"sc":5,"sl":1692},{"el":1703,"sc":5,"sl":1697},{"el":1710,"sc":5,"sl":1705},{"el":1715,"sc":5,"sl":1712},{"el":1720,"sc":5,"sl":1717}],"name":"IOUtilsTestCase","sl":88}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1004":{"methods":[{"sl":1265}],"name":"testResourceToURL_NonExistingResource","pass":true,"statements":[{"sl":1267}]},"test_1033":{"methods":[{"sl":1151}],"name":"testResourceToByteArray_Null_WithClassLoader","pass":true,"statements":[{"sl":1153}]},"test_1036":{"methods":[{"sl":450},{"sl":454}],"name":"testCloseQuietly_ServerSocketIOException","pass":true,"statements":[{"sl":452},{"sl":453},{"sl":456}]},"test_1048":{"methods":[{"sl":918}],"name":"testRead_ReadableByteChannel","pass":true,"statements":[{"sl":920},{"sl":921},{"sl":922},{"sl":923},{"sl":924},{"sl":925},{"sl":926},{"sl":927},{"sl":928},{"sl":929},{"sl":930},{"sl":936}]},"test_1059":{"methods":[{"sl":1557}],"name":"testToByteArray_URLConnection","pass":true,"statements":[{"sl":1559},{"sl":1560},{"sl":1561},{"sl":1562},{"sl":1564},{"sl":1566}]},"test_1062":{"methods":[{"sl":206}],"name":"testAsBufferedOutputStream","pass":true,"statements":[{"sl":208},{"sl":213},{"sl":214},{"sl":215}]},"test_1068":{"methods":[{"sl":805}],"name":"testCopyLarge_CharSkipInvalid","pass":true,"statements":[{"sl":807},{"sl":808}]},"test_1104":{"methods":[{"sl":812}],"name":"testCopyLarge_ExtraLength","pass":true,"statements":[{"sl":814},{"sl":815},{"sl":820},{"sl":821},{"sl":824},{"sl":826},{"sl":827},{"sl":828}]},"test_111":{"methods":[{"sl":1672}],"name":"testToString_URI","pass":true,"statements":[{"sl":1674},{"sl":1675},{"sl":1676},{"sl":1677}]},"test_1111":{"methods":[{"sl":290}],"name":"testAsBufferedWriterWithBufferSize","pass":true,"statements":[{"sl":292},{"sl":309},{"sl":310},{"sl":311},{"sl":312}]},"test_1158":{"methods":[{"sl":1364}],"name":"testSkipFully_Reader","pass":true,"statements":[{"sl":1366},{"sl":1368},{"sl":1369},{"sl":1370},{"sl":1371},{"sl":1372},{"sl":1377},{"sl":1378},{"sl":1383}]},"test_1167":{"methods":[{"sl":1502}],"name":"testToByteArray_InputStream_SizeZero","pass":true,"statements":[{"sl":1505},{"sl":1506},{"sl":1507},{"sl":1508}]},"test_117":{"methods":[{"sl":1249}],"name":"testResourceToURL_ExistingResourceAtSubPackage","pass":true,"statements":[{"sl":1251},{"sl":1252},{"sl":1253}]},"test_1202":{"methods":[{"sl":1410}],"name":"testToBufferedInputStream_InputStream","pass":true,"statements":[{"sl":1412},{"sl":1413},{"sl":1414},{"sl":1415},{"sl":1416},{"sl":1417},{"sl":1418}]},"test_1205":{"methods":[{"sl":1705},{"sl":1717}],"name":"testToString_URL_CharsetNameNull","pass":true,"statements":[{"sl":1706},{"sl":1707},{"sl":1708},{"sl":1709},{"sl":1719}]},"test_1210":{"methods":[{"sl":1452}],"name":"testToByteArray_InputStream_NegativeSize","pass":true,"statements":[{"sl":1455},{"sl":1456},{"sl":1459}]},"test_1230":{"methods":[{"sl":1434}],"name":"testToByteArray_InputStream","pass":true,"statements":[{"sl":1436},{"sl":1437},{"sl":1438},{"sl":1439},{"sl":1440},{"sl":1441}]},"test_1240":{"methods":[{"sl":178}],"name":"testAsBufferedNull","pass":true,"statements":[{"sl":180},{"sl":181},{"sl":186},{"sl":187},{"sl":192},{"sl":193},{"sl":198},{"sl":199}]},"test_1245":{"methods":[{"sl":1522}],"name":"testToByteArray_Reader","pass":true,"statements":[{"sl":1524},{"sl":1525},{"sl":1526},{"sl":1527},{"sl":1528},{"sl":1529}]},"test_125":{"methods":[{"sl":115},{"sl":1608}],"name":"testToInputStream_CharSequence","pass":true,"statements":[{"sl":116},{"sl":1610},{"sl":1611},{"sl":1612},{"sl":1613},{"sl":1614},{"sl":1615},{"sl":1616},{"sl":1617},{"sl":1618},{"sl":1619}]},"test_1252":{"methods":[{"sl":892}],"name":"testCopyLarge_SkipWithInvalidOffset","pass":true,"statements":[{"sl":894},{"sl":895},{"sl":896},{"sl":898},{"sl":899},{"sl":902},{"sl":903},{"sl":906},{"sl":908},{"sl":909},{"sl":910},{"sl":913},{"sl":914}]},"test_1254":{"methods":[{"sl":1065}],"name":"testReadLines_InputStream_String","pass":true,"statements":[{"sl":1067},{"sl":1068},{"sl":1069},{"sl":1070},{"sl":1071},{"sl":1073},{"sl":1074},{"sl":1075},{"sl":1076},{"sl":1078},{"sl":1079}]},"test_1257":{"methods":[{"sl":663}],"name":"testCopy_ByteArray_Writer","pass":true,"statements":[{"sl":665},{"sl":666},{"sl":667},{"sl":669},{"sl":672},{"sl":673},{"sl":674},{"sl":675},{"sl":676},{"sl":678}]},"test_1269":{"methods":[{"sl":681}],"name":"testCopy_String_Writer","pass":true,"statements":[{"sl":683},{"sl":684},{"sl":685},{"sl":687},{"sl":690},{"sl":691},{"sl":692},{"sl":694},{"sl":695},{"sl":697}]},"test_1276":{"methods":[{"sl":1241}],"name":"testResourceToURL_ExistingResourceAtRootPackage_WithClassLoader","pass":true,"statements":[{"sl":1243},{"sl":1245},{"sl":1246}]},"test_1279":{"methods":[{"sl":1680},{"sl":1692}],"name":"testToString_URI_CharsetNameNull","pass":true,"statements":[{"sl":1681},{"sl":1682},{"sl":1683},{"sl":1684},{"sl":1694}]},"test_1297":{"methods":[{"sl":1228}],"name":"testResourceToString_NullResource_WithClassLoader","pass":true,"statements":[{"sl":1230}]},"test_1304":{"methods":[{"sl":1177}],"name":"testResourceToString_ExistingResourceAtSubPackage","pass":true,"statements":[{"sl":1179},{"sl":1180},{"sl":1183},{"sl":1184}]},"test_133":{"methods":[{"sl":1223}],"name":"testResourceToString_NullResource","pass":true,"statements":[{"sl":1225}]},"test_1345":{"methods":[{"sl":977}],"name":"testReadFully_InputStream_Offset","pass":true,"statements":[{"sl":979},{"sl":980},{"sl":981},{"sl":982},{"sl":983},{"sl":984}]},"test_135":{"methods":[{"sl":1118}],"name":"testResourceToByteArray_ExistingResourceAtSubPackage","pass":true,"statements":[{"sl":1120},{"sl":1121},{"sl":1122},{"sl":1123}]},"test_1368":{"methods":[{"sl":248}],"name":"testAsBufferedReaderWithBufferSize","pass":true,"statements":[{"sl":250},{"sl":260},{"sl":261},{"sl":262},{"sl":263}]},"test_138":{"methods":[{"sl":1140}],"name":"testResourceToByteArray_NonExistingResource_WithClassLoader","pass":true,"statements":[{"sl":1142}]},"test_1380":{"methods":[{"sl":315}],"name":"testAsWriterAppendable","pass":true,"statements":[{"sl":317},{"sl":318},{"sl":319},{"sl":320},{"sl":321}]},"test_1410":{"methods":[{"sl":329}],"name":"testAsWriterStringBuilder","pass":true,"statements":[{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335}]},"test_1425":{"methods":[{"sl":883}],"name":"testCopyLarge_SkipInvalid","pass":true,"statements":[{"sl":885},{"sl":886},{"sl":888}]},"test_1442":{"methods":[{"sl":218}],"name":"testAsBufferedOutputStreamWithBufferSize","pass":true,"statements":[{"sl":220},{"sl":225},{"sl":226},{"sl":227},{"sl":228}]},"test_1460":{"methods":[{"sl":115},{"sl":1629}],"name":"testToInputStream_String","pass":true,"statements":[{"sl":116},{"sl":1631},{"sl":1632},{"sl":1633},{"sl":1634},{"sl":1635},{"sl":1636},{"sl":1637},{"sl":1638},{"sl":1639},{"sl":1640}]},"test_1462":{"methods":[{"sl":1281}],"name":"testResourceToURL_Null_WithClassLoader","pass":true,"statements":[{"sl":1283}]},"test_147":{"methods":[{"sl":597}],"name":"testContentEqualsIgnoreEOL","pass":true,"statements":[{"sl":600},{"sl":603},{"sl":604},{"sl":607},{"sl":608},{"sl":611},{"sl":612},{"sl":615},{"sl":616},{"sl":619},{"sl":620},{"sl":622},{"sl":623},{"sl":624},{"sl":626},{"sl":627},{"sl":628},{"sl":630},{"sl":631},{"sl":632},{"sl":634},{"sl":635},{"sl":636},{"sl":638},{"sl":639},{"sl":640}]},"test_1505":{"methods":[{"sl":1038}],"name":"testReadFully_Reader_Offset","pass":true,"statements":[{"sl":1040},{"sl":1041},{"sl":1042},{"sl":1043},{"sl":1044}]},"test_1508":{"methods":[{"sl":338}],"name":"testClose","pass":true,"statements":[{"sl":340},{"sl":341},{"sl":342}]},"test_1521":{"methods":[{"sl":1591}],"name":"testToCharArray_Reader","pass":true,"statements":[{"sl":1593},{"sl":1594},{"sl":1595},{"sl":1596},{"sl":1597}]},"test_154":{"methods":[{"sl":568}],"name":"testContentEquals_Reader_Reader","pass":true,"statements":[{"sl":571},{"sl":574},{"sl":575},{"sl":578},{"sl":579},{"sl":582},{"sl":583},{"sl":586},{"sl":587},{"sl":589},{"sl":590},{"sl":592},{"sl":593},{"sl":594}]},"test_1540":{"methods":[{"sl":1211}],"name":"testResourceToString_NullCharset","pass":true,"statements":[{"sl":1214}]},"test_1558":{"methods":[{"sl":1489}],"name":"testToByteArray_InputStream_SizeLong","pass":true,"statements":[{"sl":1492},{"sl":1493},{"sl":1496}]},"test_1563":{"methods":[{"sl":1569}],"name":"testToCharArray_InputStream","pass":true,"statements":[{"sl":1571},{"sl":1572},{"sl":1573},{"sl":1574},{"sl":1575},{"sl":1576}]},"test_1568":{"methods":[{"sl":779}],"name":"testCopyLarge_CharSkip","pass":true,"statements":[{"sl":781},{"sl":782},{"sl":783},{"sl":785},{"sl":786},{"sl":789},{"sl":790},{"sl":793},{"sl":795},{"sl":796},{"sl":797},{"sl":800},{"sl":801}]},"test_1570":{"methods":[{"sl":1205}],"name":"testResourceToString_NonExistingResource_WithClassLoader","pass":true,"statements":[{"sl":1207}]},"test_1594":{"methods":[{"sl":412},{"sl":416}],"name":"testCloseQuietly_SelectorIOException","pass":true,"statements":[{"sl":415},{"sl":418},{"sl":421}]},"test_16":{"methods":[{"sl":115},{"sl":1532}],"name":"testToByteArray_String","pass":true,"statements":[{"sl":116},{"sl":1534},{"sl":1536},{"sl":1538},{"sl":1539}]},"test_1619":{"methods":[{"sl":987}],"name":"testReadFully_ReadableByteChannel","pass":true,"statements":[{"sl":989},{"sl":990},{"sl":991},{"sl":992},{"sl":993},{"sl":994},{"sl":995},{"sl":996},{"sl":997},{"sl":998},{"sl":999},{"sl":1000},{"sl":1001},{"sl":1002},{"sl":1003},{"sl":1004},{"sl":1010}]},"test_1627":{"methods":[{"sl":1386}],"name":"testStringToOutputStream","pass":true,"statements":[{"sl":1388},{"sl":1389},{"sl":1390},{"sl":1392},{"sl":1395},{"sl":1396},{"sl":1404},{"sl":1405},{"sl":1407}]},"test_1650":{"methods":[{"sl":643}],"name":"testCopy_ByteArray_OutputStream","pass":true,"statements":[{"sl":645},{"sl":646},{"sl":647},{"sl":649},{"sl":652},{"sl":653},{"sl":655},{"sl":657},{"sl":658},{"sl":660}]},"test_1661":{"methods":[{"sl":1276}],"name":"testResourceToURL_Null","pass":true,"statements":[{"sl":1278}]},"test_168":{"methods":[{"sl":1680},{"sl":1687}],"name":"testToString_URI_CharsetName","pass":true,"statements":[{"sl":1681},{"sl":1682},{"sl":1683},{"sl":1684},{"sl":1689}]},"test_1688":{"methods":[{"sl":391}],"name":"testCloseQuietly_CloseableIOException","pass":true,"statements":[{"sl":393},{"sl":394},{"sl":395}]},"test_170":{"methods":[{"sl":952}],"name":"testReadFully_InputStream_ByteArray","pass":true,"statements":[{"sl":954},{"sl":956},{"sl":958},{"sl":959},{"sl":960},{"sl":965},{"sl":966},{"sl":967},{"sl":968},{"sl":973}]},"test_1798":{"methods":[{"sl":231}],"name":"testAsBufferedReader","pass":true,"statements":[{"sl":233},{"sl":243},{"sl":244},{"sl":245}]},"test_1816":{"methods":[{"sl":1217}],"name":"testResourceToString_NullCharset_WithClassLoader","pass":true,"statements":[{"sl":1220}]},"test_190":{"methods":[{"sl":1135}],"name":"testResourceToByteArray_NonExistingResource","pass":true,"statements":[{"sl":1137}]},"test_199":{"methods":[{"sl":462}],"name":"testCloseQuietly_Socket","pass":true,"statements":[{"sl":464},{"sl":465}]},"test_223":{"methods":[{"sl":1199}],"name":"testResourceToString_NonExistingResource","pass":true,"statements":[{"sl":1201}]},"test_227":{"methods":[{"sl":1340}],"name":"testSkipFully_ReadableByteChannel","pass":true,"statements":[{"sl":1342},{"sl":1343},{"sl":1344},{"sl":1345},{"sl":1346},{"sl":1351},{"sl":1352},{"sl":1353},{"sl":1354},{"sl":1360}]},"test_24":{"methods":[{"sl":164}],"name":"testAsBufferedInputStreamWithBufferSize","pass":true,"statements":[{"sl":166},{"sl":172},{"sl":173},{"sl":174},{"sl":175}]},"test_249":{"methods":[{"sl":1047}],"name":"testReadLines_InputStream","pass":true,"statements":[{"sl":1049},{"sl":1050},{"sl":1051},{"sl":1052},{"sl":1053},{"sl":1055},{"sl":1056},{"sl":1057},{"sl":1058},{"sl":1060},{"sl":1061}]},"test_261":{"methods":[{"sl":1157}],"name":"testResourceToString_ExistingResourceAtRootPackage","pass":true,"statements":[{"sl":1159},{"sl":1160},{"sl":1163},{"sl":1164}]},"test_267":{"methods":[{"sl":1465}],"name":"testToByteArray_InputStream_Size","pass":true,"statements":[{"sl":1467},{"sl":1468},{"sl":1469},{"sl":1470},{"sl":1471},{"sl":1472}]},"test_294":{"methods":[{"sl":498}],"name":"testConsume","pass":true,"statements":[{"sl":500},{"sl":501},{"sl":502},{"sl":505},{"sl":508},{"sl":511}]},"test_315":{"methods":[{"sl":1512}],"name":"testToByteArray_InputStream_SizeOne","pass":true,"statements":[{"sl":1515},{"sl":1516},{"sl":1517},{"sl":1518}]},"test_367":{"methods":[{"sl":1295}],"name":"testSkip_InputStream","pass":true,"statements":[{"sl":1297},{"sl":1298},{"sl":1299},{"sl":1300}]},"test_369":{"methods":[{"sl":832}],"name":"testCopyLarge_FullLength","pass":true,"statements":[{"sl":834},{"sl":835},{"sl":837},{"sl":838},{"sl":841},{"sl":843},{"sl":844},{"sl":845}]},"test_370":{"methods":[{"sl":151}],"name":"testAsBufferedInputStream","pass":true,"statements":[{"sl":153},{"sl":159},{"sl":160},{"sl":161}]},"test_408":{"methods":[{"sl":1109}],"name":"testResourceToByteArray_ExistingResourceAtRootPackage_WithClassLoader","pass":true,"statements":[{"sl":1111},{"sl":1112},{"sl":1114},{"sl":1115}]},"test_41":{"methods":[{"sl":1653}],"name":"testToString_InputStream","pass":true,"statements":[{"sl":1655},{"sl":1656},{"sl":1657},{"sl":1658},{"sl":1659}]},"test_438":{"methods":[{"sl":1234}],"name":"testResourceToURL_ExistingResourceAtRootPackage","pass":true,"statements":[{"sl":1236},{"sl":1237},{"sl":1238}]},"test_456":{"methods":[{"sl":266}],"name":"testAsBufferedWriter","pass":true,"statements":[{"sl":268},{"sl":285},{"sl":286},{"sl":287}]},"test_47":{"methods":[{"sl":480}],"name":"testConstants","pass":true,"statements":[{"sl":482},{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":490},{"sl":491},{"sl":493},{"sl":494},{"sl":495}]},"test_478":{"methods":[{"sl":431}],"name":"testCloseQuietly_SelectorTwice","pass":true,"statements":[{"sl":434},{"sl":435},{"sl":436},{"sl":439},{"sl":440}]},"test_484":{"methods":[{"sl":1101}],"name":"testResourceToByteArray_ExistingResourceAtRootPackage","pass":true,"statements":[{"sl":1103},{"sl":1104},{"sl":1105},{"sl":1106}]},"test_524":{"methods":[{"sl":115},{"sl":940}],"name":"testReadFully_InputStream__ReturnByteArray","pass":true,"statements":[{"sl":116},{"sl":942},{"sl":943},{"sl":945},{"sl":947},{"sl":949}]},"test_532":{"methods":[{"sl":1167}],"name":"testResourceToString_ExistingResourceAtRootPackage_WithClassLoader","pass":true,"statements":[{"sl":1169},{"sl":1170},{"sl":1173},{"sl":1174}]},"test_56":{"methods":[{"sl":727}],"name":"testCopyLarge_CharFullLength","pass":true,"statements":[{"sl":729},{"sl":730},{"sl":731},{"sl":733},{"sl":734},{"sl":737},{"sl":738},{"sl":741},{"sl":743},{"sl":744},{"sl":745},{"sl":748},{"sl":749}]},"test_563":{"methods":[{"sl":1304}],"name":"testSkip_ReadableByteChannel","pass":true,"statements":[{"sl":1306},{"sl":1307},{"sl":1308},{"sl":1309},{"sl":1310},{"sl":1311},{"sl":1313}]},"test_564":{"methods":[{"sl":1422}],"name":"testToBufferedInputStreamWithBufferSize_InputStream","pass":true,"statements":[{"sl":1424},{"sl":1425},{"sl":1426},{"sl":1427},{"sl":1428},{"sl":1429},{"sl":1430}]},"test_568":{"methods":[{"sl":1663}],"name":"testToString_Reader","pass":true,"statements":[{"sl":1665},{"sl":1666},{"sl":1667},{"sl":1668}]},"test_584":{"methods":[{"sl":468},{"sl":472}],"name":"testCloseQuietly_SocketIOException","pass":true,"statements":[{"sl":470},{"sl":471},{"sl":474}]},"test_595":{"methods":[{"sl":1126}],"name":"testResourceToByteArray_ExistingResourceAtSubPackage_WithClassLoader","pass":true,"statements":[{"sl":1128},{"sl":1129},{"sl":1131},{"sl":1132}]},"test_60":{"methods":[{"sl":1543}],"name":"testToByteArray_URI","pass":true,"statements":[{"sl":1545},{"sl":1546},{"sl":1547}]},"test_607":{"methods":[{"sl":1256}],"name":"testResourceToURL_ExistingResourceAtSubPackage_WithClassLoader","pass":true,"statements":[{"sl":1258},{"sl":1261},{"sl":1262}]},"test_634":{"methods":[{"sl":424}],"name":"testCloseQuietly_SelectorNull","pass":true,"statements":[{"sl":427},{"sl":428}]},"test_666":{"methods":[{"sl":345}],"name":"testCloseConsumer","pass":true,"statements":[{"sl":347},{"sl":348},{"sl":349},{"sl":350},{"sl":352},{"sl":353},{"sl":354},{"sl":355},{"sl":357},{"sl":358},{"sl":359},{"sl":360},{"sl":362},{"sl":363},{"sl":365},{"sl":366},{"sl":367}]},"test_672":{"methods":[{"sl":400}],"name":"testCloseQuietly_Selector","pass":true,"statements":[{"sl":403},{"sl":404},{"sl":405},{"sl":408}]},"test_679":{"methods":[{"sl":1146}],"name":"testResourceToByteArray_Null","pass":true,"statements":[{"sl":1148}]},"test_700":{"methods":[{"sl":1705},{"sl":1712}],"name":"testToString_URL_CharsetName","pass":true,"statements":[{"sl":1706},{"sl":1707},{"sl":1708},{"sl":1709},{"sl":1714}]},"test_707":{"methods":[{"sl":849}],"name":"testCopyLarge_NoSkip","pass":true,"statements":[{"sl":851},{"sl":852},{"sl":854},{"sl":855},{"sl":858},{"sl":860},{"sl":861},{"sl":862}]},"test_710":{"methods":[{"sl":444}],"name":"testCloseQuietly_ServerSocket","pass":true,"statements":[{"sl":446},{"sl":447}]},"test_712":{"methods":[{"sl":115},{"sl":1643}],"name":"testToString_ByteArray","pass":true,"statements":[{"sl":116},{"sl":1645},{"sl":1646},{"sl":1648},{"sl":1649}]},"test_720":{"methods":[{"sl":1083}],"name":"testReadLines_Reader","pass":true,"statements":[{"sl":1085},{"sl":1086},{"sl":1087},{"sl":1088},{"sl":1089},{"sl":1091},{"sl":1092},{"sl":1093},{"sl":1094},{"sl":1096},{"sl":1097}]},"test_75":{"methods":[{"sl":1270}],"name":"testResourceToURL_NonExistingResource_WithClassLoader","pass":true,"statements":[{"sl":1272}]},"test_792":{"methods":[{"sl":1580}],"name":"testToCharArray_InputStream_CharsetName","pass":true,"statements":[{"sl":1582},{"sl":1583},{"sl":1584},{"sl":1585},{"sl":1586},{"sl":1587}]},"test_800":{"methods":[{"sl":1476}],"name":"testToByteArray_InputStream_SizeIllegal","pass":true,"statements":[{"sl":1479},{"sl":1480},{"sl":1483}]},"test_818":{"methods":[{"sl":1317}],"name":"testSkipFully_InputStream","pass":true,"statements":[{"sl":1319},{"sl":1321},{"sl":1322},{"sl":1323},{"sl":1328},{"sl":1329},{"sl":1330},{"sl":1331},{"sl":1336}]},"test_829":{"methods":[{"sl":866}],"name":"testCopyLarge_Skip","pass":true,"statements":[{"sl":868},{"sl":869},{"sl":871},{"sl":872},{"sl":875},{"sl":877},{"sl":878},{"sl":879}]},"test_831":{"methods":[{"sl":1286}],"name":"testSkip_FileReader","pass":true,"statements":[{"sl":1288},{"sl":1289},{"sl":1290},{"sl":1291}]},"test_85":{"methods":[{"sl":514}],"name":"testContentEquals_InputStream_InputStream","pass":true,"statements":[{"sl":517},{"sl":519},{"sl":520},{"sl":521},{"sl":523},{"sl":524},{"sl":527},{"sl":528},{"sl":531},{"sl":532},{"sl":535},{"sl":536},{"sl":538},{"sl":539},{"sl":541},{"sl":542},{"sl":543},{"sl":545},{"sl":546},{"sl":547},{"sl":548},{"sl":549},{"sl":550},{"sl":551},{"sl":552},{"sl":554},{"sl":556},{"sl":559},{"sl":560},{"sl":562},{"sl":564}]},"test_858":{"methods":[{"sl":1189}],"name":"testResourceToString_ExistingResourceAtSubPackage_WithClassLoader","pass":true,"statements":[{"sl":1191},{"sl":1192},{"sl":1195},{"sl":1196}]},"test_860":{"methods":[{"sl":1550}],"name":"testToByteArray_URL","pass":true,"statements":[{"sl":1552},{"sl":1553},{"sl":1554}]},"test_873":{"methods":[{"sl":383}],"name":"testCloseQuietly_AllCloseableIOException","pass":true,"statements":[{"sl":385},{"sl":386},{"sl":388}]},"test_885":{"methods":[{"sl":324}],"name":"testAsWriterNull","pass":true,"statements":[{"sl":326}]},"test_90":{"methods":[{"sl":1697}],"name":"testToString_URL","pass":true,"statements":[{"sl":1699},{"sl":1700},{"sl":1701},{"sl":1702}]},"test_901":{"methods":[{"sl":1014}],"name":"testReadFully_Reader","pass":true,"statements":[{"sl":1016},{"sl":1018},{"sl":1020},{"sl":1021},{"sl":1022},{"sl":1023},{"sl":1024},{"sl":1029},{"sl":1030},{"sl":1035}]},"test_942":{"methods":[{"sl":371}],"name":"testCloseMulti","pass":true,"statements":[{"sl":373},{"sl":374},{"sl":375},{"sl":376},{"sl":377},{"sl":378},{"sl":379}]},"test_967":{"methods":[{"sl":753}],"name":"testCopyLarge_CharNoSkip","pass":true,"statements":[{"sl":755},{"sl":756},{"sl":757},{"sl":759},{"sl":760},{"sl":763},{"sl":764},{"sl":767},{"sl":769},{"sl":770},{"sl":771},{"sl":774},{"sl":775}]},"test_972":{"methods":[{"sl":700}],"name":"testCopyLarge_CharExtraLength","pass":true,"statements":[{"sl":702},{"sl":703},{"sl":704},{"sl":706},{"sl":707},{"sl":711},{"sl":712},{"sl":715},{"sl":717},{"sl":718},{"sl":719},{"sl":722},{"sl":723}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [524, 1460, 712, 16, 125], [524, 1460, 712, 16, 125], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [370], [], [370], [], [], [], [], [], [370], [370], [370], [], [], [24], [], [24], [], [], [], [], [], [24], [24], [24], [24], [], [], [1240], [], [1240], [1240], [], [], [], [], [1240], [1240], [], [], [], [], [1240], [1240], [], [], [], [], [1240], [1240], [], [], [], [], [], [], [1062], [], [1062], [], [], [], [], [1062], [1062], [1062], [], [], [1442], [], [1442], [], [], [], [], [1442], [1442], [1442], [1442], [], [], [1798], [], [1798], [], [], [], [], [], [], [], [], [], [1798], [1798], [1798], [], [], [1368], [], [1368], [], [], [], [], [], [], [], [], [], [1368], [1368], [1368], [1368], [], [], [456], [], [456], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [456], [456], [456], [], [], [1111], [], [1111], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1111], [1111], [1111], [1111], [], [], [1380], [], [1380], [1380], [1380], [1380], [1380], [], [], [885], [], [885], [], [], [1410], [], [1410], [1410], [1410], [1410], [1410], [], [], [1508], [], [1508], [1508], [1508], [], [], [666], [], [666], [666], [666], [666], [], [666], [666], [666], [666], [], [666], [666], [666], [666], [], [666], [666], [], [666], [666], [666], [], [], [], [942], [], [942], [942], [942], [942], [942], [942], [942], [], [], [], [873], [], [873], [873], [], [873], [], [], [1688], [], [1688], [1688], [1688], [], [], [], [], [672], [], [], [672], [672], [672], [], [], [672], [], [], [], [1594], [], [], [1594], [1594], [], [1594], [], [], [1594], [], [], [634], [], [], [634], [634], [], [], [478], [], [], [478], [478], [478], [], [], [478], [478], [], [], [], [710], [], [710], [710], [], [], [1036], [], [1036], [1036], [1036], [], [1036], [], [], [], [], [], [199], [], [199], [199], [], [], [584], [], [584], [584], [584], [], [584], [], [], [], [], [], [47], [], [47], [47], [47], [47], [47], [], [], [], [47], [47], [], [47], [47], [47], [], [], [294], [], [294], [294], [294], [], [], [294], [], [], [294], [], [], [294], [], [], [85], [], [], [85], [], [85], [85], [85], [], [85], [85], [], [], [85], [85], [], [], [85], [85], [], [], [85], [85], [], [85], [85], [], [85], [85], [85], [], [85], [85], [85], [85], [85], [85], [85], [85], [], [85], [], [85], [], [], [85], [85], [], [85], [], [85], [], [], [], [154], [], [], [154], [], [], [154], [154], [], [], [154], [154], [], [], [154], [154], [], [], [154], [154], [], [154], [154], [], [154], [154], [154], [], [], [147], [], [], [147], [], [], [147], [147], [], [], [147], [147], [], [], [147], [147], [], [], [147], [147], [], [], [147], [147], [], [147], [147], [147], [], [147], [147], [147], [], [147], [147], [147], [], [147], [147], [147], [], [147], [147], [147], [], [], [1650], [], [1650], [1650], [1650], [], [1650], [], [], [1650], [1650], [], [1650], [], [1650], [1650], [], [1650], [], [], [1257], [], [1257], [1257], [1257], [], [1257], [], [], [1257], [1257], [1257], [1257], [1257], [], [1257], [], [], [1269], [], [1269], [1269], [1269], [], [1269], [], [], [1269], [1269], [1269], [], [1269], [1269], [], [1269], [], [], [972], [], [972], [972], [972], [], [972], [972], [], [], [], [972], [972], [], [], [972], [], [972], [972], [972], [], [], [972], [972], [], [], [], [56], [], [56], [56], [56], [], [56], [56], [], [], [56], [56], [], [], [56], [], [56], [56], [56], [], [], [56], [56], [], [], [], [967], [], [967], [967], [967], [], [967], [967], [], [], [967], [967], [], [], [967], [], [967], [967], [967], [], [], [967], [967], [], [], [], [1568], [], [1568], [1568], [1568], [], [1568], [1568], [], [], [1568], [1568], [], [], [1568], [], [1568], [1568], [1568], [], [], [1568], [1568], [], [], [], [1068], [], [1068], [1068], [], [], [], [1104], [], [1104], [1104], [], [], [], [], [1104], [1104], [], [], [1104], [], [1104], [1104], [1104], [], [], [], [369], [], [369], [369], [], [369], [369], [], [], [369], [], [369], [369], [369], [], [], [], [707], [], [707], [707], [], [707], [707], [], [], [707], [], [707], [707], [707], [], [], [], [829], [], [829], [829], [], [829], [829], [], [], [829], [], [829], [829], [829], [], [], [], [1425], [], [1425], [1425], [], [1425], [], [], [], [1252], [], [1252], [1252], [1252], [], [1252], [1252], [], [], [1252], [1252], [], [], [1252], [], [1252], [1252], [1252], [], [], [1252], [1252], [], [], [], [1048], [], [1048], [1048], [1048], [1048], [1048], [1048], [1048], [1048], [1048], [1048], [1048], [], [], [], [], [], [1048], [], [], [], [524], [], [524], [524], [], [524], [], [524], [], [524], [], [], [170], [], [170], [], [170], [], [170], [170], [170], [], [], [], [], [170], [170], [170], [170], [], [], [], [], [170], [], [], [], [1345], [], [1345], [1345], [1345], [1345], [1345], [1345], [], [], [1619], [], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [1619], [], [], [], [], [], [1619], [], [], [], [901], [], [901], [], [901], [], [901], [901], [901], [901], [901], [], [], [], [], [901], [901], [], [], [], [], [901], [], [], [1505], [], [1505], [1505], [1505], [1505], [1505], [], [], [249], [], [249], [249], [249], [249], [249], [], [249], [249], [249], [249], [], [249], [249], [], [], [], [1254], [], [1254], [1254], [1254], [1254], [1254], [], [1254], [1254], [1254], [1254], [], [1254], [1254], [], [], [], [720], [], [720], [720], [720], [720], [720], [], [720], [720], [720], [720], [], [720], [720], [], [], [], [484], [], [484], [484], [484], [484], [], [], [408], [], [408], [408], [], [408], [408], [], [], [135], [], [135], [135], [135], [135], [], [], [595], [], [595], [595], [], [595], [595], [], [], [190], [], [190], [], [], [138], [], [138], [], [], [], [679], [], [679], [], [], [1033], [], [1033], [], [], [], [261], [], [261], [261], [], [], [261], [261], [], [], [532], [], [532], [532], [], [], [532], [532], [], [], [1304], [], [1304], [1304], [], [], [1304], [1304], [], [], [], [], [858], [], [858], [858], [], [], [858], [858], [], [], [223], [], [223], [], [], [], [1570], [], [1570], [], [], [], [1540], [], [], [1540], [], [], [1816], [], [], [1816], [], [], [133], [], [133], [], [], [1297], [], [1297], [], [], [], [438], [], [438], [438], [438], [], [], [1276], [], [1276], [], [1276], [1276], [], [], [117], [], [117], [117], [117], [], [], [607], [], [607], [], [], [607], [607], [], [], [1004], [], [1004], [], [], [75], [], [75], [], [], [], [1661], [], [1661], [], [], [1462], [], [1462], [], [], [831], [], [831], [831], [831], [831], [], [], [], [367], [], [367], [367], [367], [367], [], [], [], [563], [], [563], [563], [563], [563], [563], [563], [], [563], [], [], [], [818], [], [818], [], [818], [818], [818], [], [], [], [], [818], [818], [818], [818], [], [], [], [], [818], [], [], [], [227], [], [227], [227], [227], [227], [227], [], [], [], [], [227], [227], [227], [227], [], [], [], [], [], [227], [], [], [], [1158], [], [1158], [], [1158], [1158], [1158], [1158], [1158], [], [], [], [], [1158], [1158], [], [], [], [], [1158], [], [], [1627], [], [1627], [1627], [1627], [], [1627], [], [], [1627], [1627], [], [], [], [], [], [], [], [1627], [1627], [], [1627], [], [], [1202], [], [1202], [1202], [1202], [1202], [1202], [1202], [1202], [], [], [], [564], [], [564], [564], [564], [564], [564], [564], [564], [], [], [], [1230], [], [1230], [1230], [1230], [1230], [1230], [1230], [], [], [], [], [], [], [], [], [], [], [1210], [], [], [1210], [1210], [], [], [1210], [], [], [], [], [], [267], [], [267], [267], [267], [267], [267], [267], [], [], [], [800], [], [], [800], [800], [], [], [800], [], [], [], [], [], [1558], [], [], [1558], [1558], [], [], [1558], [], [], [], [], [], [1167], [], [], [1167], [1167], [1167], [1167], [], [], [], [315], [], [], [315], [315], [315], [315], [], [], [], [1245], [], [1245], [1245], [1245], [1245], [1245], [1245], [], [], [16], [], [16], [], [16], [], [16], [16], [], [], [], [60], [], [60], [60], [60], [], [], [860], [], [860], [860], [860], [], [], [1059], [], [1059], [1059], [1059], [1059], [], [1059], [], [1059], [], [], [1563], [], [1563], [1563], [1563], [1563], [1563], [1563], [], [], [], [792], [], [792], [792], [792], [792], [792], [792], [], [], [], [1521], [], [1521], [1521], [1521], [1521], [1521], [], [], [], [], [], [], [], [], [], [], [125], [], [125], [125], [125], [125], [125], [125], [125], [125], [125], [125], [], [], [], [], [], [], [], [], [], [1460], [], [1460], [1460], [1460], [1460], [1460], [1460], [1460], [1460], [1460], [1460], [], [], [712], [], [712], [712], [], [712], [712], [], [], [], [41], [], [41], [41], [41], [41], [41], [], [], [], [568], [], [568], [568], [568], [568], [], [], [], [111], [], [111], [111], [111], [111], [], [], [168, 1279], [168, 1279], [168, 1279], [168, 1279], [168, 1279], [], [], [168], [], [168], [], [], [1279], [], [1279], [], [], [90], [], [90], [90], [90], [90], [], [], [1205, 700], [1205, 700], [1205, 700], [1205, 700], [1205, 700], [], [], [700], [], [700], [], [], [1205], [], [1205], [], [], []]