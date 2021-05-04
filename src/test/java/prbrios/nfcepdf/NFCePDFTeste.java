package prbrios.nfcepdf;

import org.junit.Test;

public class NFCePDFTeste {
	
	
	@Test
	public void gerar() {
		//this.gerarPDFXML310();
		this.gerarPDFXML400();
	}
	
	private void gerarPDFXML310() {

		String xml ="<nfeProc versao=\"3.10\" xmlns=\"http://www.portalfiscal.inf.br/nfe\">"
				+ "<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\">"
				+ "<infNFe Id=\"NFe24180309305229000109650010000012301000024817\" versao=\"3.10\">"
				+ "<ide><cUF>24</cUF><cNF>00002481</cNF><natOp>Venda de mercadoria adquirida ou recebid</natOp>"
				+ "<indPag>0</indPag><mod>65</mod><serie>1</serie><nNF>1230</nNF>"
				+ "<dhEmi>2018-03-27T11:30:32-03:00</dhEmi><tpNF>1</tpNF><idDest>1</idDest><cMunFG>2408003</cMunFG>"
				+ "<tpImp>4</tpImp><tpEmis>1</tpEmis><cDV>7</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe>"
				+ "<indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>000</verProc></ide>"
				+ "<emit><CNPJ>09305229000109</CNPJ><xNome>CENTRAL DISTRIBUIDORA LTDA</xNome>"
				+ "<xFant>CENTRAL DISTRIBUIDORA DE ALIMENTOS</xFant><enderEmit>"
				+ "<xLgr>RUA LUIZ AGOSTINHO SOBRINHO</xLgr><nro>500</nro><xBairro>BARROCAS</xBairro>"
				+ "<cMun>2408003</cMun><xMun>MOSSORO</xMun><UF>RN</UF><CEP>59621466</CEP><cPais>1058</cPais>"
				+ "<xPais>BRASIL</xPais><fone>33162325</fone></enderEmit><IE>202105768</IE><CRT>3</CRT></emit>"
				+ "<dest><CPF>48269832472</CPF><xNome>JOAO ANTONIO DE LIMA</xNome><enderDest>"
				+ "<xLgr>RUA LUZIA MOURA DA SILVA</xLgr><nro>2619</nro><xBairro>ALTO SUMARE</xBairro>"
				+ "<cMun>2408003</cMun><xMun>MOSSORO</xMun><UF>RN</UF><CEP>59600000</CEP><cPais>1058</cPais>"
				+ "<xPais>BRASIL</xPais></enderDest><indIEDest>9</indIEDest></dest><det nItem=\"1\"><prod>"
				+ "<cProd>P025421</cProd><cEAN>7891150037434</cEAN>"
				+ "<xProd>SHAMPOO SEDA CRESCIMENTO SAUDAVEL 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150037434</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig>"
				+ "<CST>00</CST><modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00>"
				+ "</ICMS></imposto></det><det nItem=\"2\"><prod><cProd>P025424</cProd><cEAN>7891150037397</cEAN>"
				+ "<xProd>SHAMPOO SEDA CERAMIDAS 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150037397</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig>"
				+ "<CST>00</CST><modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00>"
				+ "</ICMS></imposto></det><det nItem=\"3\"><prod><cProd>P018226</cProd><cEAN>7896490288867</cEAN>"
				+ "<xProd>MILHO DE PIPOCA DONA CLARA 20X500G</xProd><NCM>10059010</NCM><CFOP>5102</CFOP>"
				+ "<uCom>UND</uCom><qCom>20.0000</qCom><vUnCom>2.2400</vUnCom><vProd>44.80</vProd>"
				+ "<cEANTrib>7896490288867</cEANTrib><uTrib>UND</uTrib><qTrib>20.0000</qTrib><vUnTrib>2.2400</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>1.88</vTotTrib><ICMS><ICMS00><orig>0</orig>"
				+ "<CST>00</CST><modBC>3</modBC><vBC>44.80</vBC><pICMS>18.00</pICMS><vICMS>8.06</vICMS></ICMS00>"
				+ "</ICMS></imposto></det><det nItem=\"4\"><prod><cProd>P025726</cProd><cEAN>7891150042773</cEAN>"
				+ "<xProd>SHAMPOO SEDA BRILHO E MOVIMENTO 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150042773</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig>"
				+ "<CST>00</CST><modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00>"
				+ "</ICMS></imposto></det><det nItem=\"5\"><prod><cProd>P025334</cProd><cEAN>7891150037526</cEAN>"
				+ "<xProd>SHAMPOO SEDA PRETOS LUMINOSOS 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150037526</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig>"
				+ "<CST>00</CST><modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00></ICMS>"
				+ "</imposto></det><det nItem=\"6\"><prod><cProd>P026035</cProd><cEAN>7891150049628</cEAN>"
				+ "<xProd>SHAMPOO SEDA BOMBA NUTRICAO 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150049628</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig>"
				+ "<CST>00</CST><modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00></ICMS>"
				+ "</imposto></det><det nItem=\"7\"><prod><cProd>P025423</cProd><cEAN>7891150037595</cEAN>"
				+ "<xProd>SHAMPOO SEDA CACHOS DEFINIDOS 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150037595</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig><CST>00</CST>"
				+ "<modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00></ICMS></imposto>"
				+ "</det><det nItem=\"8\"><prod><cProd>P025369</cProd><cEAN>7891150037502</cEAN>"
				+ "<xProd>SHAMPOO SEDA LISO EXTREMO 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150037502</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig><CST>00</CST>"
				+ "<modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00></ICMS></imposto>"
				+ "</det><det nItem=\"9\"><prod><cProd>P025437</cProd><cEAN>7891150037519</cEAN>"
				+ "<xProd>SHAMPOO SEDA LISO PERFEITO 12X325ML</xProd><NCM>33051000</NCM><CEST>2001700</CEST>"
				+ "<CFOP>5102</CFOP><uCom>UND</uCom><qCom>3.0000</qCom><vUnCom>5.0000</vUnCom><vProd>15.00</vProd>"
				+ "<cEANTrib>7891150037519</cEANTrib><uTrib>UND</uTrib><qTrib>3.0000</qTrib><vUnTrib>5.0000</vUnTrib>"
				+ "<indTot>1</indTot></prod><imposto><vTotTrib>2.48</vTotTrib><ICMS><ICMS00><orig>0</orig><CST>00</CST>"
				+ "<modBC>3</modBC><vBC>15.00</vBC><pICMS>18.00</pICMS><vICMS>2.70</vICMS></ICMS00></ICMS></imposto>"
				+ "</det><total><ICMSTot><vBC>164.80</vBC><vICMS>29.66</vICMS><vICMSDeson>0.00</vICMSDeson>"
				+ "<vBCST>0.00</vBCST><vST>0.00</vST><vProd>164.80</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg>"
				+ "<vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS>"
				+ "<vOutro>0.00</vOutro><vNF>164.80</vNF><vTotTrib>21.72</vTotTrib></ICMSTot></total><transp>"
				+ "<modFrete>9</modFrete></transp><pag><tPag>01</tPag><vPag>164.80</vPag></pag><infAdic>"
				+ "<infCpl>VENDEDOR : 000340 IZAMARA GOMES .|PEDIDO : FC1/019994 .||</infCpl></infAdic></infNFe>"
				+ "<infNFeSupl><qrCode><![CDATA[http://nfce.set.rn.gov.br/consultarNFCe.aspx?"
				+ "chNFe=24180309305229000109650010000012301000024817&nVersao=100&tpAmb=1&cDest=48269832472&"
				+ "dhEmi=323031382d30332d32375431313a33303a33322d30333a3030&vNF=164.80&vICMS=29.66&"
				+ "digVal=4e796d5578446245337577426f57456834424242333253686a76453d&cIdToken=000001&"
				+ "cHashQRCode=CFBB607E0AAED8B7FA83647F2E3F233A761008F1]]></qrCode></infNFeSupl>"
				+ "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo>"
				+ "<CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/>"
				+ "<SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/>"
				+ "<Reference URI=\"#NFe24180309305229000109650010000012301000024817\"><Transforms>"
				+ "<Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/>"
				+ "<Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms>"
				+ "<DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/>"
				+ "<DigestValue>NymUxDbE3uwBoWEh4BBB32ShjvE=</DigestValue></Reference></SignedInfo>"
				+ "<SignatureValue>B49zIuYI0KXkwqo9KLnrLVQqAdUzst7uDdSf/ZF/86fjo/IJeJ9O1od71zH24lW+sJxCesmSBX2AYTLIL"
				+ "CMmINiRYb0Rsw2kNOPgdTrMmz2+/GbBwkEXiWbxmiV36JV70zpHJtXqYN2wv14/zMCHoCtZB2TXqA5lxbwD4kpnZM3Rlsjor"
				+ "WDnzADF8ecoQN3dYJvLFmRlpNboRT0XAkKNzCvJCFBI9lb/Qblv6RCnr8DAfwrQzvTTM0C0ixaL5BjSUt4aij5R/trxR78YB0"
				+ "qsAaKa6uz4afLTymBwz2J6UOFqdrnssdidyKNvZeLc2hK93tZXF+f/TMlQ0BYLLImkJg==</SignatureValue><KeyInfo>"
				+ "<X509Data><X509Certificate>MIIIGTCCBgGgAwIBAgIIVZBF8kLvMWswDQYJKoZIhvcNAQELBQAwdDELMAkGA1UEBhMCQ"
				+ "lIxEzARBgNVBAoTCklDUC1CcmFzaWwxNjA0BgNVBAsTLVNlY3JldGFyaWEgZGEgUmVjZWl0YSBGZWRlcmFsIGRvIEJyYXNpbC"
				+ "AtIFJGQjEYMBYGA1UEAxMPQUMgRE9DQ0xPVUQgUkZCMB4XDTE3MDcxODEyNTMyOFoXDTE4MDcxODEyNTMyOFowgesxCzAJBgN"
				+ "VBAYTAkJSMQswCQYDVQQIEwJSTjEQMA4GA1UEBxMHTU9TU09STzETMBEGA1UEChMKSUNQLUJyYXNpbDE2MDQGA1UECxMtU2Vj"
				+ "cmV0YXJpYSBkYSBSZWNlaXRhIEZlZGVyYWwgZG8gQnJhc2lsIC0gUkZCMRYwFAYDVQQLEw1SRkIgZS1DTlBKIEExMRQwEgYDV"
				+ "QQLEwtBUiBET0NDTE9VRDFCMEAGA1UEAxM5Q0VOVFJBTCBESVNUUklCVUlET1JBIERFIEFMSU1FTlRPUyBMVERBIE1FOjA5Mz"
				+ "A1MjI5MDAwMTA5MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0XlZXAjGeMzMY7eM9DPd25BmWUVpNmXeMCDYV8m"
				+ "6jsdlkr5ZwO9pdLR1Duk3SRPqOPQkEpeCH2g4g3PGxXppysfjjfJ2Cgxn3YduSeEj7xMuyzBh1OkM71MU9FAJ5GjbKlD38QRH"
				+ "cjZ0F1sRTTTMtXAN9peLgIQQ2fPl3KK1RXGAexb/EnXDcYVHWs6zH75wozCIyb+Jbddp12u5R0/kcadBS50RKmrU6XmbMGGaw"
				+ "WWVnGaxo6noh9CwtTfBb0IbnCdAMZ+cxcNsq0DYZpk9we/ztlE7JrsVjEWDvyCt3R1qq3aVblSPeamoA8XB6qzHfp0AwjS8Qe"
				+ "ED1z5HoR8DRQIDAQABo4IDNTCCAzEwHwYDVR0jBBgwFoAUNUgoCkaqZRNMlY8dUmGVvecT44wwDgYDVR0PAQH/BAQDAgXgMHA"
				+ "GA1UdIARpMGcwZQYGYEwBAgE6MFswWQYIKwYBBQUHAgEWTWh0dHA6Ly9yZXBvc2l0b3Jpby5hY2RvY2Nsb3VkLmNvbS5ici9h"
				+ "Yy1kb2NjbG91ZHJmYi9hYy1kb2NjbG91ZC1yZmItcGMtYTEucGRmMIIBBQYDVR0fBIH9MIH6MFKgUKBOhkxodHRwOi8vcmVwb"
				+ "3NpdG9yaW8uYWNkb2NjbG91ZC5jb20uYnIvYWMtZG9jY2xvdWRyZmIvbGNyLWFjLWRvY2Nsb3VkcmZidjIuY3JsMFOgUaBPhk"
				+ "1odHRwOi8vcmVwb3NpdG9yaW8yLmFjZG9jY2xvdWQuY29tLmJyL2FjLWRvY2Nsb3VkcmZiL2xjci1hYy1kb2NjbG91ZHJmYnY"
				+ "yLmNybDBPoE2gS4ZJaHR0cDovL3JlcG9zaXRvcmlvLmljcGJyYXNpbC5nb3YuYnIvbGNyL2RvY2Nsb3VkL2xjci1hYy1kb2Nj"
				+ "bG91ZHJmYnYyLmNybDCBkQYIKwYBBQUHAQEEgYQwgYEwVAYIKwYBBQUHMAKGSGh0dHA6Ly9yZXBvc2l0b3Jpby5hY2RvY2Nsb"
				+ "3VkLmNvbS5ici9hYy1kb2NjbG91ZHJmYi9hYy1kb2NjbG91ZHJmYnYyLnA3YjApBggrBgEFBQcwAYYdaHR0cDovL29jc3AuYW"
				+ "Nkb2NjbG91ZC5jb20uYnIwgcQGA1UdEQSBvDCBuYEeTUxVSVpBQENFTlRSQUxWQVJFSklTVEEuQ09NLkJSoCkGBWBMAQMCoCA"
				+ "THlBBQkxPIE1BUkNFTCBERSBTT1VTQSBPTElWRUlSQaAZBgVgTAEDA6AQEw4wOTMwNTIyOTAwMDEwOaA4BgVgTAEDBKAvEy0w"
				+ "ODAyMTk4NTg1MTcxMDY5NDY4MDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDCgFwYFYEwBAwegDhMMMDAwMDAwMDAwMDAwMB0GA"
				+ "1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDBDAJBgNVHRMEAjAAMA0GCSqGSIb3DQEBCwUAA4ICAQAo6SvZlQu9GtMouM628y"
				+ "3fACZfyzw7KpuNvBLCw2rVoQZOZTTxf6cgLFroDl4I04aICwEhTpKCWQzLVT9wIGRNWxSTsjpzEpy2AP6o0P8iNaEF3rpybhZ"
				+ "Tw04Lu0vw2r/py2rGummajtCeva3ilVElUzEIXdWMkg+PqOcvPPn1h92zsUi4QWjGVK+OczE3pNWVoPb7rr+nK2i4o49aK5Hq"
				+ "jreWyloA9D6jzeeE1RrJnW2HfZV7lbw6RThYb2wjzEHpQ7dgal4n8TYGD5WHINRgxe3SRpV5QrjdqlEmBNuk2lvh6kUV1wCxp"
				+ "Z9ASLLuBUbe/DyliIBpB12LOirboM8KrJRoK3QWYFGHrgVj3NtYata5YaE9xi/wQM8yl6E0BXBhgMZkqfWTlqVkzPGPAv8uOt"
				+ "7mDjO1aAffuDNMGAwLyBD6y1P1UXAXebQCz4LLW6gRDlyEf9KeGUXwKpCXr/o6ATDnHH8SJSuPpEAOYnc8+N8ioCxkbwni6Ry"
				+ "bbmD6hgcSTo3qHaeTuUJA6riIXSEl8AzB8RrnE0Hz5uBVm7ZPb+5UDNxbWCckgp9TUPO+Vf2R+/J12nRh0Ja7ZTk9GdYje5U1"
				+ "uOK44eqwUn7xE8C1sfJ11eNaEjy1szd7atOG6ZgZOkASjkAFuzZ68xAO/zNUQScotcFvHHqr644eN5yR9A==</X509Certifi"
				+ "cate></X509Data></KeyInfo></Signature></NFe><protNFe xmlns=\"http://www.portalfiscal.inf.br/nfe\""
				+ " versao=\"3.10\"><infProt><tpAmb>1</tpAmb><verAplic>SVRSnfce201802051656</verAplic><chNFe>2418030"
				+ "9305229000109650010000012301000024817</chNFe><dhRecbto>2018-03-27T11:35:14-03:00</dhRecbto><nProt"
				+ ">324180071219449</nProt><digVal>NymUxDbE3uwBoWEh4BBB32ShjvE=</digVal><cStat>100</cStat><xMotivo>A"
				+ "utorizado o uso da NF-e</xMotivo></infProt></protNFe></nfeProc>";

		xml = "<nfeProc><NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe Id=\"NFe24180409305229000532650010000001501000014010\" versao=\"3.10\"><ide><cUF>24</cUF><cNF>00001401</cNF><natOp>Venda de mercadoria adquirida ou recebid</natOp><indPag>0</indPag><mod>65</mod><serie>1</serie><nNF>150</nNF><dhEmi>2018-04-11T15:48:40-03:00</dhEmi><tpNF>1</tpNF><idDest>1</idDest><cMunFG>2408003</cMunFG><tpImp>4</tpImp><tpEmis>1</tpEmis><cDV>0</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>000</verProc></ide><emit><CNPJ>09305229000532</CNPJ><xNome>CENTRAL DISTRIBUIDORA DE ALIMENTOS LTDA   ME</xNome><xFant>NONATO ATACAREJO  DEPOSITO FECHADO</xFant><enderEmit><xLgr>RUA ALCIDES HENRIQUE DA SILVA</xLgr><nro>S N</nro><xBairro>BARROCAS</xBairro><cMun>2408003</cMun><xMun>MOSSORO</xMun><UF>RN</UF><CEP>59621375</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderEmit><IE>204819946</IE><CRT>3</CRT></emit><det nItem=\"1\"><prod><cProd>P002028</cProd><cEAN>7896490288881</cEAN><xProd>FLOCOS DE MILHO CLARAMIL 30X500G</xProd><NCM>11041900</NCM><CFOP>5102</CFOP><uCom>UND</uCom><qCom>1.0000</qCom><vUnCom>0.6100</vUnCom><vProd>0.61</vProd><cEANTrib>7896490288881</cEANTrib><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>0.6100</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>0.03</vTotTrib><ICMS><ICMS20><orig>0</orig><CST>20</CST><modBC>3</modBC><pRedBC>33.33</pRedBC><vBC>0.41</vBC><pICMS>18.00</pICMS><vICMS>0.07</vICMS></ICMS20></ICMS></imposto></det><total><ICMSTot><vBC>0.41</vBC><vICMS>0.07</vICMS><vICMSDeson>0.00</vICMSDeson><vBCST>0.00</vBCST><vST>0.00</vST><vProd>0.61</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>0.61</vNF><vTotTrib>0.03</vTotTrib></ICMSTot></total><transp><modFrete>9</modFrete></transp><pag><tPag>01</tPag><vPag>0.61</vPag></pag><infAdic><infCpl>VENDEDOR : 000589 MICAELLE KELIANA .|PEDIDO : FC5/000399 .||</infCpl></infAdic></infNFe><infNFeSupl><qrCode>http://nfce.set.rn.gov.br/consultarNFCe.aspx?chNFe=24180409305229000532650010000001501000014010&amp;nVersao=100&amp;tpAmb=1&amp;dhEmi=323031382d30342d31315431353a34383a34302d30333a3030&amp;vNF=0.61&amp;vICMS=0.07&amp;digVal=4859657241786c616b685231574d4e6f712f374446474d453932413d&amp;cIdToken=000001&amp;cHashQRCode=AA12B55DB72CD8DF9B775BF17BDD8AE06106205D</qrCode></infNFeSupl><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe24180409305229000532650010000001501000014010\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>HYerAxlakhR1WMNoq/7DFGME92A=</DigestValue></Reference></SignedInfo><SignatureValue>oOdKxTJomWSUIlM/z1AS1xUtYzrhcMWBM6o0Xyekuztr5is6HGpPsjQODeABuNCcOca83sqgEWTVoE8vc+pmnCUwnnSIbBk2un8+8H1+9rXRmqqieY2qvuGurAZCZrEesNeAxpqtW6mWd61sDlQzpY6uXefVoJrVM3lxIdnjgGHdDJ7bnDHhLQGWdzC+lrVhDzqtX5w+M1J3Ii+FJrFbMLKM4VLjVb76KOi7VLMac9kAzpFvlSLriZ2dYyqw+50BlLiu4ecE6PmqTecGtPIfW/ae5HtN8tUD2V7w8wJjverXl0GQmA4Uq7AGXhfpB/QRpOkEAcTD5LBI9rcHXC/Dtw==</SignatureValue><KeyInfo><X509Data><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></NFe><protNFe><infProt><dhRecbto>2018-04-11T15:53:38</dhRecbto><nProt>324180084173940</nProt></infProt></protNFe></nfeProc>";
		
		try {
			NFCePDF nfcePdf = new NFCePDF(xml, null);
			nfcePdf.gerarPdfAutorizacao();
			System.out.println(nfcePdf.getSaida());
			
			NFCePDFImpressao imp = new NFCePDFImpressao();
			imp.imprimir(nfcePdf.getSaida());
			
		}catch(NFCePDFException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void gerarPDFXML400() {
		
		String xml ="<nfeProc versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><NFe xmlns=\"http://www.p"
				+ "ortalfiscal.inf.br/nfe\"><infNFe Id=\"NFe41180706230511000186650010000010169000022671\" "
				+ "versao=\"4.00\"><ide><cUF>41</cUF><cNF>00002267</cNF><natOp>Venda de mercadoria adquirida ou rece"
				+ "bida de terceiros</natOp><mod>65</mod><serie>1</serie><nNF>1016</nNF><dhEmi>2018-07-11T12:58:09-0"
				+ "3:00</dhEmi><tpNF>1</tpNF><idDest>1</idDest><cMunFG>4106902</cMunFG><tpImp>4</tpImp><tpEmis>9</tp"
				+ "Emis><cDV>1</cDV><tpAmb>2</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><pro"
				+ "cEmi>0</procEmi><verProc>000</verProc><dhCont>2018-07-10T12:00:52-03:00</dhCont><xJust>PROBLEMA N"
				+ "A INTERNET</xJust></ide><emit><CNPJ>06230511000186</CNPJ><xNome>FORT CURITIBA COMERCIAL DE FOLHEA"
				+ "DOS E ACESSORIOS LTDA</xNome><xFant>CURITIBA</xFant><enderEmit><xLgr>RUA DESEMBARGADOR WESTPHALEN"
				+ "</xLgr><nro>123</nro><xBairro>CENTRO</xBairro><cMun>4106902</cMun><xMun>CURITIBA</xMun><UF>PR</UF"
				+ "><CEP>80010110</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderEmit><IE>9030389260</IE><CRT>1"
				+ "</CRT></emit><dest><CPF>07857700975</CPF><xNome>NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VAL"
				+ "OR FISCAL</xNome><enderDest><xLgr>LOCALIDADE SAO CARLOS DO IVAI</xLgr><nro>1599</nro><xBairro>CEN"
				+ "TRO</xBairro><cMun>4124608</cMun><xMun>SAO CARLOS DO IVAI</xMun><UF>PR</UF><CEP>87770000</CEP><cP"
				+ "ais>1058</cPais><xPais>BRASIL</xPais><fone>34381145</fone></enderDest><indIEDest>9</indIEDest></d"
				+ "est><det nItem=\"1\"><prod><cProd>050907</cProd><cEAN>1234567891231</cEAN><xProd>NOTA FISCAL EMIT"
				+ "IDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xProd><NCM>90041000</NCM><CFOP>5102</CFOP><uCo"
				+ "m>UND</uCom><qCom>1.0000</qCom><vUnCom>45.0000</vUnCom><vProd>45.00</vProd><cEANTrib>123456789123"
				+ "1</cEANTrib><uTrib>UND</uTrib><qTrib>1.0000</qTrib><vUnTrib>45.0000</vUnTrib><indTot>1</indTot></"
				+ "prod><imposto><vTotTrib>0.00</vTotTrib><ICMS><ICMSSN102><orig>0</orig><CSOSN>102</CSOSN></ICMSSN1"
				+ "02></ICMS></imposto></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vICMSDeson>0.00</vIC"
				+ "MSDeson><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</"
				+ "vFCPSTRet><vProd>45.00</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00<"
				+ "/vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>"
				+ "0.00</vOutro><vNF>45.00</vNF><vTotTrib>0.00</vTotTrib></ICMSTot></total><transp><modFrete>9</modF"
				+ "rete></transp><pag><detPag><tPag>01</tPag><vPag>45.00</vPag></detPag></pag><infAdic><infCpl>DOCUM"
				+ "ENTO EMITIDO POR ME OPTANTE PELO SIMPLES NACIONAL. NAO GERA DIREITO A CREDITO FISCAL DE ICMS.|</i"
				+ "nfCpl></infAdic></infNFe><infNFeSupl><qrCode><![CDATA[http://www.fazenda.pr.gov.br/nfce/qrcode/?c"
				+ "hNFe=41180706230511000186650010000010169000022671&nVersao=100&tpAmb=2&cDest=07857700975&dhEmi=323"
				+ "031382d30372d31315431323a35383a30392d30333a3030&vNF=45.00&vICMS=0.00&digVal=5551746130454e707a683"
				+ "26d6f763051754b30435776416c6e4b4d3d&cIdToken=000003&cHashQRCode=79806B50D1A69BC9090F95EA9C97953B5"
				+ "EEE866B]]></qrCode><urlChave>http://www.fazenda.pr.gov.br</urlChave></infNFeSupl><Signature xmlns"
				+ "=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://ww"
				+ "w.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/"
				+ "xmldsig#rsa-sha1\"/><Reference URI=\"#NFe41180706230511000186650010000010169000022671\"><Transfor"
				+ "ms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Alg"
				+ "orithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm="
				+ "\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>UQta0ENpzh2mov0QuK0CWvAlnKM=</DigestValu"
				+ "e></Reference></SignedInfo><SignatureValue>EUn/98siWLFOCyjfo5wqQbSSrCnPEI8PViYJ+bVcs+j8Y23eIyIpxe"
				+ "3Nw/zTcytRVTWs4qfPTqbeH7dExF+gvXko2zw0KoeSnTloJbfoKE0xwzrlzuVWJrs+mybmZrMTerMiOxP1t8+3WJsKn0T/QCS"
				+ "ydTAH/RQ7NkbvHbaUHBsYMDwibN9P2u58wOtQpfwUO5gwcM8LzVu82fpsyZhpL9okPTnih5UZcgVkFMysbnRveDnp3/DCYVEN"
				+ "aOzSOf6KNreogbs4lygHeG5BfmuoQWDmsTsRKBG7OfncYWH1rDFyfSV/UZ1sAAZg53yyH9N/s3Itqc6Q7csDn3+P/gqeNA==<"
				+ "/SignatureValue><KeyInfo><X509Data><X509Certificate>MIIIDTCCBfWgAwIBAgIQYPYyTU/3LxVl7kUfrmK42jANB"
				+ "gkqhkiG9w0BAQsFADB4MQswCQYDVQQGEwJCUjETMBEGA1UEChMKSUNQLUJyYXNpbDE2MDQGA1UECxMtU2VjcmV0YXJpYSBkYS"
				+ "BSZWNlaXRhIEZlZGVyYWwgZG8gQnJhc2lsIC0gUkZCMRwwGgYDVQQDExNBQyBDZXJ0aXNpZ24gUkZCIEc1MB4XDTE4MDMyNzE"
				+ "0MzEzMVoXDTE5MDMyNzE0MzEzMVowgf0xCzAJBgNVBAYTAkJSMRMwEQYDVQQKDApJQ1AtQnJhc2lsMQswCQYDVQQIDAJQUjER"
				+ "MA8GA1UEBwwIQ3VyaXRpYmExNjA0BgNVBAsMLVNlY3JldGFyaWEgZGEgUmVjZWl0YSBGZWRlcmFsIGRvIEJyYXNpbCAtIFJGQ"
				+ "jEWMBQGA1UECwwNUkZCIGUtQ05QSiBBMTEfMB0GA1UECwwWQXV0ZW50aWNhZG8gcG9yIEFSIEFibDFIMEYGA1UEAww/Rk9SVC"
				+ "BDVVJJVElCQSBDT01FUkNJTyBERSBGT0xIRUFET1MgRSBBQ0VTU09SSU9TOjA2MjMwNTExMDAwMTg2MIIBIjANBgkqhkiG9w0"
				+ "BAQEFAAOCAQ8AMIIBCgKCAQEAxgQsCsIWEGq+O2npLcZra+8jcShDzCwYJaaalOF8d2Ahv+lYC7zsUDSoUqHEs3VCpooV8uN1"
				+ "Lf1Rse7UJ3EfWheG/w2eijRaidx+ZivhIhgdwG+KWicKMppiZ32AfQz+oSPfw1c0f+M1IHPC7NUVe8Iz3tM7Tx3qQ4CzHSc5n"
				+ "SF/ib6RwylRQDbm4Shrdw5DcV0/6SCcE5SkP3q7JwaVo22bqsWI7HpSmjMbsxD11JGQ8Hf7AXh9Exm4Riegu5jB9UwYqF2/MH"
				+ "T+vzVn+rZVIP8dg08TlriA2BoKeqflzhTJoQ2w/Z1FFc8PdWIjm3mInv1Ry7rJ1IWncPUmALuUowIDAQABo4IDCzCCAwcwgbo"
				+ "GA1UdEQSBsjCBr6A+BgVgTAEDBKA1BDMxOTAzMTk2MTczMzgyNTU4MzAwMDAwMDAwMDAwMDAwMDAwMDAxNTQzNzY1NzdTRVNQ"
				+ "U1CgIQYFYEwBAwKgGAQWUk9TQSBNQVJJQSBGUkFOQ0EgTElNQaAZBgVgTAEDA6AQBA4wNjIzMDUxMTAwMDE4NqAXBgVgTAEDB"
				+ "6AOBAwwMDAwMDAwMDAwMDCBFm1hcmNlbGFAZ3J1cG9yaG9tYS5jb20wCQYDVR0TBAIwADAfBgNVHSMEGDAWgBRTfX+dvtFh0C"
				+ "C62p/jiacTc1jNQjB/BgNVHSAEeDB2MHQGBmBMAQIBDDBqMGgGCCsGAQUFBwIBFlxodHRwOi8vaWNwLWJyYXNpbC5jZXJ0aXN"
				+ "pZ24uY29tLmJyL3JlcG9zaXRvcmlvL2RwYy9BQ19DZXJ0aXNpZ25fUkZCL0RQQ19BQ19DZXJ0aXNpZ25fUkZCLnBkZjCBvAYD"
				+ "VR0fBIG0MIGxMFegVaBThlFodHRwOi8vaWNwLWJyYXNpbC5jZXJ0aXNpZ24uY29tLmJyL3JlcG9zaXRvcmlvL2xjci9BQ0Nlc"
				+ "nRpc2lnblJGQkc1L0xhdGVzdENSTC5jcmwwVqBUoFKGUGh0dHA6Ly9pY3AtYnJhc2lsLm91dHJhbGNyLmNvbS5ici9yZXBvc2"
				+ "l0b3Jpby9sY3IvQUNDZXJ0aXNpZ25SRkJHNS9MYXRlc3RDUkwuY3JsMA4GA1UdDwEB/wQEAwIF4DAdBgNVHSUEFjAUBggrBgE"
				+ "FBQcDAgYIKwYBBQUHAwQwgawGCCsGAQUFBwEBBIGfMIGcMF8GCCsGAQUFBzAChlNodHRwOi8vaWNwLWJyYXNpbC5jZXJ0aXNp"
				+ "Z24uY29tLmJyL3JlcG9zaXRvcmlvL2NlcnRpZmljYWRvcy9BQ19DZXJ0aXNpZ25fUkZCX0c1LnA3YzA5BggrBgEFBQcwAYYta"
				+ "HR0cDovL29jc3AtYWMtY2VydGlzaWduLXJmYi5jZXJ0aXNpZ24uY29tLmJyMA0GCSqGSIb3DQEBCwUAA4ICAQC3OaH1FsbQRt"
				+ "QA47T67XnwDtwfotxVnEZlqCeUQTAGX27v2AfA7L0yLXD4mjO9/5+fQ7a9L6bmdGAdPFbrjKvfn2Exl19Z46eQx/uDq3sG1Y5"
				+ "8CmadY9MFkRnDCfhMRTvDJBP0xg1M7/wUZ6xmfIBJ/k3efaWgLm3IUZcSHdbbgRGTHfrW1IszyKdzO9rFEMXBeoBI1pWt8Zh2"
				+ "1Tr9J5ddKFMKYaNHPbFq2R4g845/5z/uicilmKATrZUPQ4S/5fV17PBhWiXAjAh9/Q95EwrO/MZi1ZKyIWVGyoPPIN8hNIgOT"
				+ "mVJWfzQf1OxGa5vgWKtemt8cMNNr3VABGME28dcrZvTwAo1TtY9TNIl3cVm6JMTFDAKp2kKstfh2Rq3MxybaOHA0wJ4GV2leU"
				+ "Gzg/9aZAzwJrVkjmzEgABQg69wFDbvRuBEQKXHkyK/7ve8V5Yc01W3mIgNmAm+n7SBIdKJ/UsQkwb/6Ipm0C/XyRcUzlTraXC"
				+ "lAO2TqUgrJGIjS5XrAmWTVVozRsfClUBGHi0vnectII1yqA8ZNU73pSrTxwnXrK1acc55wFf7TPpPc5I0gDSmVpbx4K5Sl5+y"
				+ "oeWLA8VeXeUKJrkeKrEajmer2TiPDwIOCwVwkbHSm2/iiljK+5QW/dJSTg7I8G9gIFCUhgLDT22PfAMavwrHtzPgOw==</X50"
				+ "9Certificate></X509Data></KeyInfo></Signature></NFe><protNFe xmlns=\"http://www.portalfiscal.inf."
				+ "br/nfe\" versao=\"4.00\"><infProt><tpAmb>2</tpAmb><verAplic>PR-v4_1_5</verAplic><chNFe>4118070623"
				+ "0511000186650010000010169000022671</chNFe><dhRecbto>2018-07-11T12:59:15-03:00</dhRecbto><nProt>14"
				+ "1180000878683</nProt><digVal>UQta0ENpzh2mov0QuK0CWvAlnKM=</digVal><cStat>100</cStat><xMotivo>Auto"
				+ "rizado o uso da NF-e</xMotivo></infProt></protNFe></nfeProc>";
		
		xml = "<nfeProc versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><NFe><infNFe Id=\"NFe15180907272825004797650010000000211345371905\" versao=\"4.00\"><ide><cUF>15</cUF><cNF>34537190</cNF><natOp>Venda de mercadoria adquirida de terceiro</natOp><mod>65</mod><serie>1</serie><nNF>21</nNF><dhEmi>2018-09-06T15:37:25-03:00</dhEmi><tpNF>1</tpNF><idDest>1</idDest><cMunFG>1501402</cMunFG><tpImp>4</tpImp><tpEmis>1</tpEmis><cDV>5</cDV><tpAmb>2</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>1.0</verProc></ide><emit><CNPJ>07272825004797</CNPJ><xNome>TECNO INDUSTRIA E COMERCIO DE COMPUTADO</xNome><xFant>TECNO INDUSTRIA E COMERCIO DE COMPUTADO</xFant><enderEmit><xLgr>TRV PADRE EUTIQUIO</xLgr><nro>1078</nro><xCpl>SHOPPING PATIO BELEMLOJA 147</xCpl><xBairro>BATISTA CAMPOS</xBairro><cMun>1501402</cMun><xMun>1501402</xMun><UF>PA</UF><CEP>66023710</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>8536535448</fone></enderEmit><IE>156052750</IE><CRT>3</CRT></emit><dest><CPF>47110973093</CPF><xNome>NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xNome><indIEDest>9</indIEDest></dest><det nItem=\"1\"><prod><cProd>23321</cProd><cEAN>SEM GTIN</cEAN><xProd>NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xProd><NCM>85234990</NCM><CEST>0000000</CEST><CFOP>5405</CFOP><uCom>UND</uCom><qCom>1</qCom><vUnCom>199.9</vUnCom><vProd>199.90</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UND</uTrib><qTrib>1</qTrib><vUnTrib>199.9</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>48.40</vTotTrib><ICMS><ICMS60><orig>1</orig><CST>60</CST></ICMS60></ICMS></imposto></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vICMSDeson>0.00</vICMSDeson><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>199.90</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>199.90</vNF><vTotTrib>48.40</vTotTrib></ICMSTot></total><transp><modFrete>9</modFrete></transp><pag><detPag><tPag>01</tPag><vPag>199.90</vPag></detPag></pag></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe15180907272825004797650010000000211345371905\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>C63U+Ixlthwj4Zyea7vbxnbkUcU=</DigestValue></Reference></SignedInfo><SignatureValue>Lubh8e2xESbdLJOTldP0lsAVc9s1ihQ+R61LXVtkuiBHdzmXpYd+sU5fF9nRIn/dcDtFAGP7IjII"
				+ "H9BgfFBSJOvegzkcxbO6E7L4nnXem4NaT0jWo+BOakMEFoWhJ55M7qojD9tC8HziaV2m718e8wnF"
				+ "8mDEyIn0xlgtw2KX/8sUgxL4DP79ytMcZZC2sPkG6V6txwB2wxeKVYsGJuc88+HpN56jjG/v+cvq"
				+ "kHePMNvZqtsEtjisnZdu+ogkSGuIBkqIToSvxjpSCJwKj4QH/cc9sRk/j6EOSeDuyofcAKyDOH8B"
				+ "ZjTMR4TiVkNrZer1F7ImKyemeKpZayCUNAREhQ==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIH/TCCBeWgAwIBAgIIH5jem6T1+r4wDQYJKoZIhvcNAQELBQAwcDELMAkGA1UEBhMCQlIxEzAR"
				+ "BgNVBAoTCklDUC1CcmFzaWwxMjAwBgNVBAsTKUF1dG9yaWRhZGUgQ2VydGlmaWNhZG9yYSBWQUxJ"
				+ "RCAtIEFDIFZBTElEMRgwFgYDVQQDEw9BQyBWQUxJRCBCUkFTSUwwHhcNMTgwNjAxMTgwMDM4WhcN"
				+ "MTkwNjAxMTgwMDM4WjCBxDELMAkGA1UEBhMCQlIxCzAJBgNVBAgTAkNFMRIwEAYDVQQHEwlGT1JU"
				+ "QUxFWkExEzARBgNVBAoTCklDUC1CcmFzaWwxGDAWBgNVBAsTD0FDIFZBTElEIEJSQVNJTDEbMBkG"
				+ "A1UECxMSUGVzc29hIEp1cmlkaWNhIEExMQ4wDAYDVQQLEwVWQUxJRDE4MDYGA1UEAxMvVEVDTk8g"
				+ "SU5EVVNUUklBIEUgQ09NRVJDSU8gREUgQ09NUFVUQURPUkVTIExUREEwggEiMA0GCSqGSIb3DQEB"
				+ "AQUAA4IBDwAwggEKAoIBAQDLg72FsNG132svX3fUEpuVhkrNCUwdWpTZ1hjyIMiVJ4B8tjIsEV6+"
				+ "SzM/Db5CmoA9XbVE09vgpvevKb89ziHS0jm1ruFUO95Q1qByiV/YIyCI0PTSk1VqLwpSQ7Uo7dBq"
				+ "LZSMyoV+dO38kvWIO0ZEUw1W92XimWSPfU48MGOgLS9yzJr7JXgPYHZgkLpEIcFa+9YUr6AKYGYx"
				+ "/S7j1X9ZeIgU6pB1HEBtqbt5krlVdQ+tF3krO5ZiptBex+6Uldai+LVuz8MfHe1Jjiecq93HcOZL"
				+ "aaOdwBDUQoyJqIg1IQIaC4n3Ka/Q6clh4JBstyEuDSlrG3nmQnriPWiUyHmPAgMBAAGjggNEMIID"
				+ "QDCBoAYIKwYBBQUHAQEEgZMwgZAwWwYIKwYBBQUHMAKGT2h0dHA6Ly9pY3AtYnJhc2lsLnZhbGlk"
				+ "Y2VydGlmaWNhZG9yYS5jb20uYnIvYWMtdmFsaWRicmFzaWwvYWMtdmFsaWRicmFzaWx2Mi5wN2Iw"
				+ "MQYIKwYBBQUHMAGGJWh0dHA6Ly9vY3NwLnZhbGlkY2VydGlmaWNhZG9yYS5jb20uYnIwCQYDVR0T"
				+ "BAIwADAfBgNVHSMEGDAWgBQFzReNxh8URo3o59PjDL1NHDYRrTB0BgNVHSAEbTBrMGkGBmBMAQIB"
				+ "JDBfMF0GCCsGAQUFBwIBFlFodHRwOi8vaWNwLWJyYXNpbC52YWxpZGNlcnRpZmljYWRvcmEuY29t"
				+ "LmJyL2FjLXZhbGlkYnJhc2lsL2RwYy1hYy12YWxpZGJyYXNpbC5wZGYwggESBgNVHR8EggEJMIIB"
				+ "BTBZoFegVYZTaHR0cDovL2ljcC1icmFzaWwudmFsaWRjZXJ0aWZpY2Fkb3JhLmNvbS5ici9hYy12"
				+ "YWxpZGJyYXNpbC9sY3ItYWMtdmFsaWRicmFzaWx2Mi5jcmwwWqBYoFaGVGh0dHA6Ly9pY3AtYnJh"
				+ "c2lsMi52YWxpZGNlcnRpZmljYWRvcmEuY29tLmJyL2FjLXZhbGlkYnJhc2lsL2xjci1hYy12YWxp"
				+ "ZGJyYXNpbHYyLmNybDBMoEqgSIZGaHR0cDovL3JlcG9zaXRvcmlvLmljcGJyYXNpbC5nb3YuYnIv"
				+ "bGNyL1ZBTElEL2xjci1hYy12YWxpZGJyYXNpbHYyLmNybDAOBgNVHQ8BAf8EBAMCBeAwHQYDVR0l"
				+ "BBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMEMIGzBgNVHREEgaswgaiBFXRob2xhbmRhQGlieXRlLmNv"
				+ "bS5icqA4BgVgTAEDBKAvBC0yMzA1MTk3NjcwMzk2ODkyMzUzMDAwMDAwMDAwMDAwMDAwMDAwMDAw"
				+ "MDAwMDCgIQYFYEwBAwKgGAQWUEVEUk8gSVZPIE1FTkRFUyBGUk9UQaAZBgVgTAEDA6AQBA4wNzI3"
				+ "MjgyNTAwMDEwNKAXBgVgTAEDB6AOBAwwMDAwMDAwMDAwMDAwDQYJKoZIhvcNAQELBQADggIBAGE/"
				+ "beEJE1v05PpqqxGr34Ix4EEweSaxPve3y6UyaJYsja7o9SInmJPRIz8mEAFFW3Z8ImEoKBVz4xy2"
				+ "05SP6gm/ZzZ5qQyNbHS9gcRkTxTl921q+WPWpYPOg5c0NT/C6oHO7qbk7OpE4DySI2Z0RRqTOmzy"
				+ "KOP+hf1GAltxkW/3Io3g3POA22UveQbP4jxLDeflAU1DRkCKt1eVcyX7hrINxsKNnM5iqUmBK2+b"
				+ "Mav0j12gK1m3ae766IQJz8m02Fz5Vt+BBbKhEQ3OuTazrv/nPiXfj2DYWdrrBTNzMxu0NtH8v+L8"
				+ "J9rjHBb60BvwD40eoHj0XHWCdogEkGl4kDbywXdQl0X03Vqveai8IMhY3XDpu8/VJw+KG8wcl+ei"
				+ "ieBBDECWAmr/BdL9cMsq2tM8dUNl84mAQrTL31Apr9hZqVVsnkLPRY0A7X2/HmV4WCqh+5E2i3vV"
				+ "FC9KzCPcwf0mkRRCAUXynZAcNGJ+J648v3gNS0gg/H3L85+Fllhc9sPYvjoggj5FnENUPCAvZ11+"
				+ "BQzzVrjZpANWLeNdyV7W8njO+MNsq2dV5htTmmkfW5v5lfXl7PBdn40nXsGdvktit3nMallRsewr"
				+ "Sz7d/U7na6witV9a8HIBPUUAeKCr9y4+zxXpZKDaEn0pmsrguiAhtv5iuPon+KU7tC9gL6Ue</X509Certificate></X509Data></KeyInfo></Signature></NFe><protNFe versao=\"4.00\"><infProt><tpAmb>2</tpAmb><verAplic>SVRSnfce201808291440</verAplic><chNFe>15180907272825004797650010000000211345371905</chNFe><dhRecbto>2018-09-06T15:37:37-03:00</dhRecbto><nProt>315180004056932</nProt><digVal>C63U+Ixlthwj4Zyea7vbxnbkUcU=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso da NF-e</xMotivo></infProt></protNFe></nfeProc>";
	
		xml = "<nfeProc><NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe Id=\"NFe15180907272825004797650020000000129520256386\" versao=\"4.00\"><ide><cUF>15</cUF><cNF>52025638</cNF><natOp>Venda de mercadoria adquirida de terceiro</natOp><mod>65</mod><serie>2</serie><nNF>12</nNF><dhEmi>2018-09-11T14:35:29-03:00</dhEmi><tpNF>1</tpNF><idDest>1</idDest><cMunFG>1501402</cMunFG><tpImp>4</tpImp><tpEmis>9</tpEmis><cDV>6</cDV><tpAmb>2</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>1.0</verProc><dhCont>2018-01-01T00:00:00-02:00</dhCont><xJust>PROBLEMAS NA COMUNICACAO</xJust></ide><emit><CNPJ>07272825004797</CNPJ><xNome>TECNO INDUSTRIA E COMERCIO DE COMPUTADO</xNome><xFant>TECNO INDUSTRIA E COMERCIO DE COMPUTADO</xFant><enderEmit><xLgr>TRV PADRE EUTIQUIO</xLgr><nro>1078</nro><xCpl>SHOPPING PATIO BELEMLOJA 147</xCpl><xBairro>BATISTA CAMPOS</xBairro><cMun>1501402</cMun><xMun>1501402</xMun><UF>PA</UF><CEP>66023710</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>8536535448</fone></enderEmit><IE>156052750</IE><CRT>3</CRT></emit><dest><CPF>47110973093</CPF><xNome>NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xNome><indIEDest>9</indIEDest></dest><det nItem=\"1\"><prod><cProd>23321</cProd><cEAN>SEM GTIN</cEAN><xProd>NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xProd><NCM>85234990</NCM><CEST>0000000</CEST><CFOP>5405</CFOP><uCom>UND</uCom><qCom>1</qCom><vUnCom>199.9</vUnCom><vProd>199.90</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UND</uTrib><qTrib>1</qTrib><vUnTrib>199.9</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>48.40</vTotTrib><ICMS><ICMS60><orig>1</orig><CST>60</CST></ICMS60></ICMS></imposto></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vICMSDeson>0.00</vICMSDeson><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>199.90</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>199.90</vNF><vTotTrib>48.40</vTotTrib></ICMSTot></total><transp><modFrete>9</modFrete></transp><pag><detPag><tPag>01</tPag><vPag>50.00</vPag></detPag><detPag><tPag>01</tPag><vPag>26.23</vPag></detPag><vTroco>16.34</vTroco></pag></infNFe><infNFeSupl><qrCode><![CDATA[https://appnfc.sefa.pa.gov.br/portal-homologacao/view/consultas/nfce/nfceForm.seam?chNFe=15180907272825004797650020000000129520256386&nVersao=100&tpAmb=2&cDest=47110973093&dhEmi=323031382d30392d31315431343a33353a32392d30333a3030&vNF=199.90&vICMS=0.00&digVal=774e33414e643773534c68414537693373425034753276536b69593d&cIdToken=000001&cHashQRCode=39dee09ce7eee40f336a248b00d922e279e8d856]]></qrCode><urlChave>https://appnfc.sefa.pa.gov.br/portal/view/consultas/nfce/consultanfce.seam</urlChave></infNFeSupl><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe15180907272825004797650020000000129520256386\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>wN3ANd7sSLhAE7i3sBP4u2vSkiY=</DigestValue></Reference></SignedInfo><SignatureValue>ue+OZTJperViGj1eQKTCMzV0giwTgzQX/i5/adLIlzOapBixh5cJoSFVCzb/fpUaIM44/8m5TdmA"
				+ "WluMRcd3qRJ6iWwfzP7W5FaSv00PlOgu2wruyxntP/N9Mx6AMs7bh7LCmSgMcNUXyXp66X2p6ny2"
				+ "wou5BNC31hlxR2/dAsemxduEd2gBirgYgBaH8bRe80lp+kujJnens/jZ4cLlwOjB1mVm+2DQypmH"
				+ "2ZignmAbT8WrLp9dATmXpA8QAUFwv5nmJw/EFQKsqvtiZqzVIUQ6K+cUNHYX3C+ytfY526Yk6W93"
				+ "WZUR0zSNogoLn+HJ7zrzOqsPhzrrtCTDNV5IEA==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIH/TCCBeWgAwIBAgIIH5jem6T1+r4wDQYJKoZIhvcNAQELBQAwcDELMAkGA1UEBhMCQlIxEzAR"
				+ "BgNVBAoTCklDUC1CcmFzaWwxMjAwBgNVBAsTKUF1dG9yaWRhZGUgQ2VydGlmaWNhZG9yYSBWQUxJ"
				+ "RCAtIEFDIFZBTElEMRgwFgYDVQQDEw9BQyBWQUxJRCBCUkFTSUwwHhcNMTgwNjAxMTgwMDM4WhcN"
				+ "MTkwNjAxMTgwMDM4WjCBxDELMAkGA1UEBhMCQlIxCzAJBgNVBAgTAkNFMRIwEAYDVQQHEwlGT1JU"
				+ "QUxFWkExEzARBgNVBAoTCklDUC1CcmFzaWwxGDAWBgNVBAsTD0FDIFZBTElEIEJSQVNJTDEbMBkG"
				+ "A1UECxMSUGVzc29hIEp1cmlkaWNhIEExMQ4wDAYDVQQLEwVWQUxJRDE4MDYGA1UEAxMvVEVDTk8g"
				+ "SU5EVVNUUklBIEUgQ09NRVJDSU8gREUgQ09NUFVUQURPUkVTIExUREEwggEiMA0GCSqGSIb3DQEB"
				+ "AQUAA4IBDwAwggEKAoIBAQDLg72FsNG132svX3fUEpuVhkrNCUwdWpTZ1hjyIMiVJ4B8tjIsEV6+"
				+ "SzM/Db5CmoA9XbVE09vgpvevKb89ziHS0jm1ruFUO95Q1qByiV/YIyCI0PTSk1VqLwpSQ7Uo7dBq"
				+ "LZSMyoV+dO38kvWIO0ZEUw1W92XimWSPfU48MGOgLS9yzJr7JXgPYHZgkLpEIcFa+9YUr6AKYGYx"
				+ "/S7j1X9ZeIgU6pB1HEBtqbt5krlVdQ+tF3krO5ZiptBex+6Uldai+LVuz8MfHe1Jjiecq93HcOZL"
				+ "aaOdwBDUQoyJqIg1IQIaC4n3Ka/Q6clh4JBstyEuDSlrG3nmQnriPWiUyHmPAgMBAAGjggNEMIID"
				+ "QDCBoAYIKwYBBQUHAQEEgZMwgZAwWwYIKwYBBQUHMAKGT2h0dHA6Ly9pY3AtYnJhc2lsLnZhbGlk"
				+ "Y2VydGlmaWNhZG9yYS5jb20uYnIvYWMtdmFsaWRicmFzaWwvYWMtdmFsaWRicmFzaWx2Mi5wN2Iw"
				+ "MQYIKwYBBQUHMAGGJWh0dHA6Ly9vY3NwLnZhbGlkY2VydGlmaWNhZG9yYS5jb20uYnIwCQYDVR0T"
				+ "BAIwADAfBgNVHSMEGDAWgBQFzReNxh8URo3o59PjDL1NHDYRrTB0BgNVHSAEbTBrMGkGBmBMAQIB"
				+ "JDBfMF0GCCsGAQUFBwIBFlFodHRwOi8vaWNwLWJyYXNpbC52YWxpZGNlcnRpZmljYWRvcmEuY29t"
				+ "LmJyL2FjLXZhbGlkYnJhc2lsL2RwYy1hYy12YWxpZGJyYXNpbC5wZGYwggESBgNVHR8EggEJMIIB"
				+ "BTBZoFegVYZTaHR0cDovL2ljcC1icmFzaWwudmFsaWRjZXJ0aWZpY2Fkb3JhLmNvbS5ici9hYy12"
				+ "YWxpZGJyYXNpbC9sY3ItYWMtdmFsaWRicmFzaWx2Mi5jcmwwWqBYoFaGVGh0dHA6Ly9pY3AtYnJh"
				+ "c2lsMi52YWxpZGNlcnRpZmljYWRvcmEuY29tLmJyL2FjLXZhbGlkYnJhc2lsL2xjci1hYy12YWxp"
				+ "ZGJyYXNpbHYyLmNybDBMoEqgSIZGaHR0cDovL3JlcG9zaXRvcmlvLmljcGJyYXNpbC5nb3YuYnIv"
				+ "bGNyL1ZBTElEL2xjci1hYy12YWxpZGJyYXNpbHYyLmNybDAOBgNVHQ8BAf8EBAMCBeAwHQYDVR0l"
				+ "BBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMEMIGzBgNVHREEgaswgaiBFXRob2xhbmRhQGlieXRlLmNv"
				+ "bS5icqA4BgVgTAEDBKAvBC0yMzA1MTk3NjcwMzk2ODkyMzUzMDAwMDAwMDAwMDAwMDAwMDAwMDAw"
				+ "MDAwMDCgIQYFYEwBAwKgGAQWUEVEUk8gSVZPIE1FTkRFUyBGUk9UQaAZBgVgTAEDA6AQBA4wNzI3"
				+ "MjgyNTAwMDEwNKAXBgVgTAEDB6AOBAwwMDAwMDAwMDAwMDAwDQYJKoZIhvcNAQELBQADggIBAGE/"
				+ "beEJE1v05PpqqxGr34Ix4EEweSaxPve3y6UyaJYsja7o9SInmJPRIz8mEAFFW3Z8ImEoKBVz4xy2"
				+ "05SP6gm/ZzZ5qQyNbHS9gcRkTxTl921q+WPWpYPOg5c0NT/C6oHO7qbk7OpE4DySI2Z0RRqTOmzy"
				+ "KOP+hf1GAltxkW/3Io3g3POA22UveQbP4jxLDeflAU1DRkCKt1eVcyX7hrINxsKNnM5iqUmBK2+b"
				+ "Mav0j12gK1m3ae766IQJz8m02Fz5Vt+BBbKhEQ3OuTazrv/nPiXfj2DYWdrrBTNzMxu0NtH8v+L8"
				+ "J9rjHBb60BvwD40eoHj0XHWCdogEkGl4kDbywXdQl0X03Vqveai8IMhY3XDpu8/VJw+KG8wcl+ei"
				+ "ieBBDECWAmr/BdL9cMsq2tM8dUNl84mAQrTL31Apr9hZqVVsnkLPRY0A7X2/HmV4WCqh+5E2i3vV"
				+ "FC9KzCPcwf0mkRRCAUXynZAcNGJ+J648v3gNS0gg/H3L85+Fllhc9sPYvjoggj5FnENUPCAvZ11+"
				+ "BQzzVrjZpANWLeNdyV7W8njO+MNsq2dV5htTmmkfW5v5lfXl7PBdn40nXsGdvktit3nMallRsewr"
				+ "Sz7d/U7na6witV9a8HIBPUUAeKCr9y4+zxXpZKDaEn0pmsrguiAhtv5iuPon+KU7tC9gL6Ue</X509Certificate></X509Data></KeyInfo></Signature></NFe></nfeProc>";
		
		xml = "<nfeProc versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><NFe><infNFe Id=\"NFe24210511926896000150650010000396751617040411\" versao=\"4.00\"><ide><cUF>24</cUF><cNF>61704041</cNF><natOp>Venda de mercadoria adquirida de terceiro</natOp><mod>65</mod><serie>1</serie><nNF>39675</nNF><dhEmi>2021-05-03T14:42:57-03:00</dhEmi><tpNF>1</tpNF><idDest>1</idDest><cMunFG>2408003</cMunFG><tpImp>4</tpImp><tpEmis>1</tpEmis><cDV>1</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>1.0</verProc></ide><emit><CNPJ>11926896000150</CNPJ><xNome>WA COMERCIO DE ALIMENTICIOS LTDA</xNome><xFant>WA COMERCIO DE ALIMENTICIOS LTDA</xFant><enderEmit><xLgr>TV JOSE JERONIMO DE MEDEIROS</xLgr><nro>220</nro><xBairro>LAGOA DO MATO</xBairro><cMun>2408003</cMun><xMun>Mossoró</xMun><UF>RN</UF><CEP>59604347</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>8433162839</fone></enderEmit><IE>200269623</IE><CRT>3</CRT></emit><det nItem=\"1\"><prod><cProd>P039669</cProd><cEAN>SEM GTIN</cEAN><xProd>BOMBONS FINOS GATORICES GAROTO 30X250G</xProd><NCM>18069000</NCM><CFOP>5102</CFOP><uCom>UNI</uCom><qCom>1</qCom><vUnCom>9.91</vUnCom><vProd>9.91</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UNI</uTrib><qTrib>1</qTrib><vUnTrib>9.91</vUnTrib><vDesc>0.30</vDesc><indTot>1</indTot></prod><imposto><ICMS><ICMS00><orig>1</orig><CST>00</CST><modBC>3</modBC><vBC>9.91</vBC><pICMS>18.00</pICMS><vICMS>1.78</vICMS></ICMS00></ICMS></imposto></det><total><ICMSTot><vBC>9.91</vBC><vICMS>1.78</vICMS><vICMSDeson>0.00</vICMSDeson><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>9.91</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.30</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>9.61</vNF></ICMSTot></total><transp><modFrete>9</modFrete></transp><pag><detPag><tPag>01</tPag><vPag>50.00</vPag></detPag><vTroco>40.39</vTroco></pag><infAdic><infCpl>Operador: MICHELE(000002)</infCpl></infAdic></infNFe><infNFeSupl><qrCode><![CDATA[http://nfce.set.rn.gov.br/consultarNFCe.aspx?p=24210511926896000150650010000396751617040411|2|1|1|D74654B0A32219486F8BE12F16EFA129A09C967C]]></qrCode><urlChave>www.set.rn.gov.br/nfce/consulta</urlChave></infNFeSupl><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe24210511926896000150650010000396751617040411\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>Ze639G0ASHncUQOql34Uek/70vo=</DigestValue></Reference></SignedInfo><SignatureValue>cNPjyiTVroLFIbZUg3zsLdUD5bNlhPx3nX0o6f3UU1OPf3U6GUj3H99OAJ4Tagrj07GDJ9eVqGpE\r\n" + 
				"G8GOj1aU6qHmhzUTioykLaNo6m7gNkk7DULfne0KLQCLfyEOQUOVrICyEWcgqpB85Gr596PJF07I\r\n" + 
				"tV9dEZqCh06m1j6QnyazWqql+gmZIp/HIlXozUeI1OXaJpxlrvoIwGbCviZG2Mdmq3s8+JrPrcMt\r\n" + 
				"1L2ZP+2GYTdhluPdu80mlqgJo7ZDUo44gbBayS1VF/5z7EMyMKbdlKoSi3PvFz7ZkitDevVUu3ya\r\n" + 
				"wwPt9iMMjokauS8NShJneD5AbW+0g2zg2Tqirw==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIH+zCCBeOgAwIBAgIId+IxY++wnAswDQYJKoZIhvcNAQELBQAwdTELMAkGA1UEBhMCQlIxEzAR\r\n" + 
				"BgNVBAoTCklDUC1CcmFzaWwxNjA0BgNVBAsTLVNlY3JldGFyaWEgZGEgUmVjZWl0YSBGZWRlcmFs\r\n" + 
				"IGRvIEJyYXNpbCAtIFJGQjEZMBcGA1UEAxMQQUMgT05MSU5FIFJGQiB2NTAeFw0yMDA1MjEyMTQ0\r\n" + 
				"NDJaFw0yMTA1MjEyMTQ0NDJaMIIBBTELMAkGA1UEBhMCQlIxCzAJBgNVBAgTAlJOMRAwDgYDVQQH\r\n" + 
				"EwdNT1NTT1JPMRMwEQYDVQQKEwpJQ1AtQnJhc2lsMTYwNAYDVQQLEy1TZWNyZXRhcmlhIGRhIFJl\r\n" + 
				"Y2VpdGEgRmVkZXJhbCBkbyBCcmFzaWwgLSBSRkIxFjAUBgNVBAsTDVJGQiBlLUNOUEogQTExIjAg\r\n" + 
				"BgNVBAsTGUFSIFNPTElNT0VTIENFUlRJRklDQURPUkExFzAVBgNVBAsTDjIyNzU5NTMxMDAwMTAz\r\n" + 
				"MTUwMwYDVQQDEyxXQSBDT01FUkNJTyBERSBBTElNRU5UT1MgTFREQToxMTkyNjg5NjAwMDE1MDCC\r\n" + 
				"ASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAN/O+XpYwLCYSlTP9YsqBxpeBEqwHSc+y3tN\r\n" + 
				"zzrFSdU1jd1M8Xew8I7vtaR7DeDsbUUSqsMaXi3ByAGpA0ZJBbcsUu4toRUIAJeTJd+a1njVpdff\r\n" + 
				"Kbr0ZSrcTFfwb3MTUP2BOEfcZuZfi3yI+rql1vefETl+dZEbYcxamJ2/wb8wo+Wee56a7nB2XFyx\r\n" + 
				"Cw1aM8p/ldcBsGOeH69X+3CEdRZU8azU9s2Dklmezs5HX9/a7OzxIYuPIMI11rGRHjghUIldfJJe\r\n" + 
				"NrQZNP9YD8KcBf3vH8mNarhiD3i8gpLfjY1+3tUnaW1/tzvoIadfaK0o1ok57Jeh4Nml9hTqzQDc\r\n" + 
				"w98CAwEAAaOCAvswggL3MIGjBggrBgEFBQcBAQSBljCBkzBcBggrBgEFBQcwAoZQaHR0cDovL2lj\r\n" + 
				"cC1icmFzaWwudnBraS52YWxpZGNlcnRpZmljYWRvcmEuY29tLmJyL2FjLW9ubGluZXJmYi9hYy1v\r\n" + 
				"bmxpbmVyZmJ2NS5wN2IwMwYIKwYBBQUHMAGGJ2h0dHA6Ly9vY3NwdjUudmFsaWRjZXJ0aWZpY2Fk\r\n" + 
				"b3JhLmNvbS5icjAJBgNVHRMEAjAAMB8GA1UdIwQYMBaAFOzJzKuyKNWhvHdArt+Qb8Ptf7zpMHcG\r\n" + 
				"A1UdIARwMG4wbAYGYEwBAgE3MGIwYAYIKwYBBQUHAgEWVGh0dHA6Ly9pY3AtYnJhc2lsLnZwa2ku\r\n" + 
				"dmFsaWRjZXJ0aWZpY2Fkb3JhLmNvbS5ici9hYy1vbmxpbmVyZmIvZHBjLWFjLW9ubGluZXJmYnY1\r\n" + 
				"LnBkZjCBugYDVR0fBIGyMIGvMFWgU6BRhk9odHRwOi8vaWNwLWJyYXNpbC52YWxpZGNlcnRpZmlj\r\n" + 
				"YWRvcmEuY29tLmJyL2FjLW9ubGluZXJmYi9sY3ItYWMtb25saW5lcmZidjUuY3JsMFagVKBShlBo\r\n" + 
				"dHRwOi8vaWNwLWJyYXNpbDIudmFsaWRjZXJ0aWZpY2Fkb3JhLmNvbS5ici9hYy1vbmxpbmVyZmIv\r\n" + 
				"bGNyLWFjLW9ubGluZXJmYnY1LmNybDAOBgNVHQ8BAf8EBAMCBeAwHQYDVR0lBBYwFAYIKwYBBQUH\r\n" + 
				"AwIGCCsGAQUFBwMEMIG9BgNVHREEgbUwgbKBFWNvbnRhYmlsMUBjZHJuLmNvbS5icqA9BgVgTAED\r\n" + 
				"BKA0BDIwNjAxMTk1NjE2MDY5OTQzNDQ5MDAwMDAwMDAwMDAwMDAwMDAwMDAzMzEwOTBTU1BQQqAm\r\n" + 
				"BgVgTAEDAqAdBBtSQUlNVU5ETyBOT05BVE8gREUgT0xJVkVJUkGgGQYFYEwBAwOgEAQOMTE5MjY4\r\n" + 
				"OTYwMDAxNTCgFwYFYEwBAwegDgQMMDAwMDAwMDAwMDAwMA0GCSqGSIb3DQEBCwUAA4ICAQAJAGUW\r\n" + 
				"KhgdLy1pEkGH6mJ0qsT++5B7AaUMaw0+GZenzOYDweerqbMlJv6gE0ORflCiXmdQSzoSX0jjhzDE\r\n" + 
				"BVtRm1Z/Lc65XxLwVnrk9PkHuuW6DQw0joKDj6eAhAlCnxpf0N4Y96fvTU/1SL7PYGXJpx+NINUZ\r\n" + 
				"jGMOawW5t9Jpjw4TFBOWDXMvBuc0TqiGPYO6MhQbixR7hYMUSCNomVOqV0/RFMlW/uvX9vl5bban\r\n" + 
				"JU1U75vu0snYkzqcwFkccHViDZTxjLLsS/ETtX3qXu0NERaGn0TAeWcyJCsKHCVNXHb9r3fNmWhu\r\n" + 
				"Et25rAWycQS+n5OvdKQIjj9lRvOJHEi4LmgoPD+si8caryMsirzNF9aAXV3X7gboXQRqabT2Bm+7\r\n" + 
				"YOVLKns67fN1dRlQ8S0mmMWinlLpR1KiAfkJAKd53yzJjIYhZX51AhiPJIg2yotamhlTbtwdh0OP\r\n" + 
				"08XN/DWzFSXTSCWf8iKteQzwPuS1xDjMi3kvkOAgjFF3yFqF1ugytIq+ZGN0NI3Y71c5nb2edXE2\r\n" + 
				"Y+9rSpiryZ+G+lnaK5CXTreuCoP1bBfHxucF9g8Y1IfvuKmWAoujJW/HErSA0Ev4X9je/0hDfgcD\r\n" + 
				"oOu6DONtHvIOITZ//e7MDttOyagtXImJlbP5hQX4WO3ioPBno9vSKyK18mKHNrfe8bI0VA==</X509Certificate></X509Data></KeyInfo></Signature></NFe><protNFe versao=\"4.00\"><infProt><tpAmb>1</tpAmb><verAplic>SVRSnfce202103291658</verAplic><chNFe>24210511926896000150650010000396751617040411</chNFe><dhRecbto>2021-05-03T14:43:14-03:00</dhRecbto><nProt>324210105984603</nProt><digVal>Ze639G0ASHncUQOql34Uek/70vo=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso da NF-e</xMotivo></infProt></protNFe></nfeProc>";
		
		try {
			NFCePDF nfcePdf = new NFCePDF(xml, null);
			nfcePdf.gerarPdfAutorizacao();
			System.out.println(nfcePdf.getSaida());
			
			NFCePDFImpressao imp = new NFCePDFImpressao();
			imp.imprimir(nfcePdf.getSaida());
			
		}catch(NFCePDFException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
