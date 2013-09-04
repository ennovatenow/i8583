/**
 * Copyright 2013 Evolvus Solutions Pvt. Ltd
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.i8583.impl;

import java.util.HashMap;
import java.util.Map;

import org.i8583.ElementType;
import org.i8583.MessageType;
import org.i8583.spi.MessageTypeFactory;

/**
 * Default in-memory implementation of the <code>MessageTypeFactory</code>.
 * <p/>
 * Always returns the same set of <code>ElementType</code>'s for all MTI. Used to
 * quickly get off the ground and test implementations.
 * <p/>
 * Using this <code>MessageFactory</code> needs no other configuration.
 * <p/>
 * <code>MessageType messageType = new DefaultMessageFactory().getMessageType("1210");</code>
 * <p/>
 * The complete definition of the data elements is provided in the table below,
 * <table style="margin: 1em 0px;background-color: rgb(249, 249, 249);border: 1px solid rgb(170, 170, 170);border-collapse: collapse;">
 * <tr>
 * <th style="background-color: rgb(242, 242, 242);text-align: center;border: 1px solid rgb(170, 170, 170);padding: 0.2em">Field #</th>
 * <th style="background-color: rgb(242, 242, 242);text-align: center;border: 1px solid rgb(170, 170, 170);padding: 0.2em">Content Type</th>
 * <th style="background-color: rgb(242, 242, 242);text-align: center;border: 1px solid rgb(170, 170, 170);padding: 0.2em">Maximum Length</th>
 * <th style="background-color: rgb(242, 242, 242);text-align: center;border: 1px solid rgb(170, 170, 170);padding: 0.2em">Fixed</th>
 * </tr>
 * <tr>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">1</td>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">Binary</td>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">128</td>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">Y</td>
 * </tr>
  * <tr>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">1</td>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">Numeric</td>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">19</td>
 * <td style="border: 1px solid rgb(170, 170, 170);padding: 0.2em">N</td>
 * </tr>
 * </table>
 * 
 * @author ennovatenow
 * 
 */
public class DefaultMessageTypeFactory implements MessageTypeFactory {
    
    private Map<String, MessageType> messageTypeCache = new HashMap<String, MessageType>(128);
    
    private final static ElementType element1 = new DefaultElementType(DefaultElementType.BINARY,128,DefaultElementType.FIXED);
    private final static ElementType element2 = new DefaultElementType(DefaultElementType.NUMERIC,19,DefaultElementType.VARIABLE);
    private final static ElementType element3 = new DefaultElementType(DefaultElementType.NUMERIC,6,DefaultElementType.FIXED);
    private final static ElementType element4 = new DefaultElementType(DefaultElementType.NUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element5 = new DefaultElementType(DefaultElementType.NUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element6 = new DefaultElementType(DefaultElementType.NUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element7 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element8 = new DefaultElementType(DefaultElementType.NUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element9 = new DefaultElementType(DefaultElementType.NUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element10 = new DefaultElementType(DefaultElementType.NUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element11 = new DefaultElementType(DefaultElementType.NUMERIC,6,DefaultElementType.FIXED);
    private final static ElementType element12 = new DefaultElementType(DefaultElementType.NUMERIC,6,DefaultElementType.FIXED);
    private final static ElementType element13 = new DefaultElementType(DefaultElementType.NUMERIC,4,DefaultElementType.FIXED);
    private final static ElementType element14 = new DefaultElementType(DefaultElementType.NUMERIC,4,DefaultElementType.FIXED);
    private final static ElementType element15 = new DefaultElementType(DefaultElementType.NUMERIC,4,DefaultElementType.FIXED);
    private final static ElementType element16 = new DefaultElementType(DefaultElementType.NUMERIC,4,DefaultElementType.FIXED);
    private final static ElementType element17 = new DefaultElementType(DefaultElementType.NUMERIC,4,DefaultElementType.FIXED);
    private final static ElementType element18 = new DefaultElementType(DefaultElementType.NUMERIC,4,DefaultElementType.FIXED);
    private final static ElementType element19 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element20 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element21 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element22 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element23 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element24 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element25 = new DefaultElementType(DefaultElementType.NUMERIC,2,DefaultElementType.FIXED);
    private final static ElementType element26 = new DefaultElementType(DefaultElementType.NUMERIC,2,DefaultElementType.FIXED);
    private final static ElementType element27 = new DefaultElementType(DefaultElementType.NUMERIC,1,DefaultElementType.FIXED);
    private final static ElementType element28 = new DefaultElementType(DefaultElementType.NUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element29 = new DefaultElementType(DefaultElementType.NUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element30 = new DefaultElementType(DefaultElementType.NUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element31 = new DefaultElementType(DefaultElementType.NUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element32 = new DefaultElementType(DefaultElementType.NUMERIC,11,DefaultElementType.VARIABLE);
    private final static ElementType element33 = new DefaultElementType(DefaultElementType.NUMERIC,11,DefaultElementType.VARIABLE);
    private final static ElementType element34 = new DefaultElementType(DefaultElementType.NUMERIC,28,DefaultElementType.VARIABLE);
    private final static ElementType element35 = new DefaultElementType(DefaultElementType.TRACKCODE,37,DefaultElementType.VARIABLE);
    private final static ElementType element36 = new DefaultElementType(DefaultElementType.NUMERIC,104,DefaultElementType.VARIABLE);
    private final static ElementType element37 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element38 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,6,DefaultElementType.FIXED);
    private final static ElementType element39 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,2,DefaultElementType.FIXED);
    private final static ElementType element40 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element41 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,16,DefaultElementType.FIXED);
    private final static ElementType element42 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,15,DefaultElementType.FIXED);
    private final static ElementType element43 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,40,DefaultElementType.FIXED);
    private final static ElementType element44 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,25,DefaultElementType.VARIABLE);
    private final static ElementType element45 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,76,DefaultElementType.VARIABLE);
    private final static ElementType element46 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,999,DefaultElementType.VARIABLE);
    private final static ElementType element47 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,999,DefaultElementType.VARIABLE);
    private final static ElementType element48 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,999,DefaultElementType.VARIABLE);
    private final static ElementType element49 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element50 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element51 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element52 = new DefaultElementType(DefaultElementType.BINARY,64,DefaultElementType.FIXED);
    private final static ElementType element53 = new DefaultElementType(DefaultElementType.NUMERIC,18,DefaultElementType.FIXED);
    private final static ElementType element54 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,120,DefaultElementType.VARIABLE);
    private final static ElementType element55 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element56 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element57 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element58 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element59 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element60 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,7,DefaultElementType.VARIABLE);
    private final static ElementType element61 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element62 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element63 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element64 = new DefaultElementType(DefaultElementType.BINARY,16,DefaultElementType.FIXED);
    private final static ElementType element65 = new DefaultElementType(DefaultElementType.BINARY,64,DefaultElementType.FIXED);
    private final static ElementType element66 = new DefaultElementType(DefaultElementType.NUMERIC,1,DefaultElementType.FIXED);
    private final static ElementType element67 = new DefaultElementType(DefaultElementType.NUMERIC,2,DefaultElementType.FIXED);
    private final static ElementType element68 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element69 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element70 = new DefaultElementType(DefaultElementType.NUMERIC,3,DefaultElementType.FIXED);
    private final static ElementType element71 = new DefaultElementType(DefaultElementType.NUMERIC,4,DefaultElementType.FIXED);
    private final static ElementType element72 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element73 = new DefaultElementType(DefaultElementType.NUMERIC,6,DefaultElementType.FIXED);
    private final static ElementType element74 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element75 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element76 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element77 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element78 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element79 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element80 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element81 = new DefaultElementType(DefaultElementType.NUMERIC,10,DefaultElementType.FIXED);
    private final static ElementType element82 = new DefaultElementType(DefaultElementType.NUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element83 = new DefaultElementType(DefaultElementType.NUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element84 = new DefaultElementType(DefaultElementType.NUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element85 = new DefaultElementType(DefaultElementType.NUMERIC,12,DefaultElementType.FIXED);
    private final static ElementType element86 = new DefaultElementType(DefaultElementType.NUMERIC,15,DefaultElementType.FIXED);
    private final static ElementType element87 = new DefaultElementType(DefaultElementType.NUMERIC,15,DefaultElementType.FIXED);
    private final static ElementType element88 = new DefaultElementType(DefaultElementType.NUMERIC,15,DefaultElementType.FIXED);
    private final static ElementType element89 = new DefaultElementType(DefaultElementType.NUMERIC,15,DefaultElementType.FIXED);
    private final static ElementType element90 = new DefaultElementType(DefaultElementType.NUMERIC,42,DefaultElementType.FIXED);
    private final static ElementType element91 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,1,DefaultElementType.FIXED);
    private final static ElementType element92 = new DefaultElementType(DefaultElementType.NUMERIC,2,DefaultElementType.FIXED);
    private final static ElementType element93 = new DefaultElementType(DefaultElementType.NUMERIC,5,DefaultElementType.FIXED);
    private final static ElementType element94 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,7,DefaultElementType.FIXED);
    private final static ElementType element95 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,42,DefaultElementType.FIXED);
    private final static ElementType element96 = new DefaultElementType(DefaultElementType.ALPHANUMERIC,8,DefaultElementType.FIXED);
    private final static ElementType element97 = new DefaultElementType(DefaultElementType.NUMERIC,16,DefaultElementType.FIXED);
    private final static ElementType element98 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,25,DefaultElementType.FIXED);
    private final static ElementType element99 = new DefaultElementType(DefaultElementType.NUMERIC,11, DefaultElementType.VARIABLE);
    private final static ElementType element100 = new DefaultElementType(DefaultElementType.NUMERIC,11,DefaultElementType.VARIABLE);
    private final static ElementType element101 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL, 17, DefaultElementType.FIXED);
    private final static ElementType element102 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL, 28, DefaultElementType.VARIABLE);
    private final static ElementType element103 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL, 28, DefaultElementType.VARIABLE);
    private final static ElementType element104 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,100,DefaultElementType.VARIABLE);
    private final static ElementType element105 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element106 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element107 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element108 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element109 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element110 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element111 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element112 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element113 = new DefaultElementType(DefaultElementType.NUMERIC,11,DefaultElementType.VARIABLE);
    private final static ElementType element114 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element115 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element116 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element117 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element118 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element119 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element120 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element121 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element122 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element123 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element124 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,255,DefaultElementType.VARIABLE);
    private final static ElementType element125 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,50,DefaultElementType.VARIABLE);
    private final static ElementType element126 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element127 = new DefaultElementType(DefaultElementType.ALPHANUMERSPECIAL,999,DefaultElementType.VARIABLE);
    private final static ElementType element128 = new DefaultElementType(DefaultElementType.BINARY,16,DefaultElementType.FIXED);

    /*
     * (non-Javadoc)
     * 
     * @see org.i8583.spi.MessageTypeFactory#getMessageType(java.lang.String)
     */
    @Override
    public MessageType getMessageType(String mti) {
        if(mti == null) {
            throw new IllegalArgumentException("Invalid parameter value mti: " + mti);            
        }
        DefaultMessageType result = (DefaultMessageType)messageTypeCache.get(mti);
        if(result == null) {
            result = new DefaultMessageType(mti);     
            result.setBitmap(element1);
            result.add(2, element2);
            result.add(3,element3);
            result.add(4,element4);
            result.add(5,element5);
            result.add(6,element6);
            result.add(7,element7);
            result.add(8,element8);
            result.add(9,element9);
            result.add(10,element10);
            result.add(11,element11);
            result.add(12,element12);
            result.add(13,element13);
            result.add(14,element14);
            result.add(15,element15);
            result.add(16,element16);
            result.add(17,element17);
            result.add(18,element18);
            result.add(19,element19);
            result.add(20,element20);
            result.add(21,element21);
            result.add(22,element22);
            result.add(23,element23);
            result.add(24,element24);
            result.add(25,element25);
            result.add(26,element26);
            result.add(27,element27);
            result.add(28,element28);
            result.add(29,element29);
            result.add(30,element30);
            result.add(31,element31);
            result.add(32,element32);
            result.add(33,element33);
            result.add(34,element34);
            result.add(35,element35);
            result.add(36,element36);
            result.add(37,element37);
            result.add(38,element38);
            result.add(39,element39);
            result.add(40,element40);
            result.add(41,element41);
            result.add(42,element42);
            result.add(43,element43);
            result.add(44,element44);
            result.add(45,element45);
            result.add(46,element46);
            result.add(47,element47);
            result.add(48,element48);
            result.add(49,element49);
            result.add(50,element50);
            result.add(51,element51);
            result.add(52,element52);
            result.add(53,element53);
            result.add(54,element54);
            result.add(55,element55);
            result.add(56,element56);
            result.add(57,element57);
            result.add(58,element58);
            result.add(59,element59);
            result.add(60,element60);
            result.add(61,element61);
            result.add(62,element62);
            result.add(63,element63);
            result.add(64,element64);
            result.add(65,element65);
            result.add(66,element66);
            result.add(67,element67);
            result.add(68,element68);
            result.add(69,element69);
            result.add(70,element70);
            result.add(71,element71);
            result.add(72,element72);
            result.add(73,element73);
            result.add(74,element74);
            result.add(75,element75);
            result.add(76,element76);
            result.add(77,element77);
            result.add(78,element78);
            result.add(79,element79);
            result.add(80,element80);
            result.add(81,element81);
            result.add(82,element82);
            result.add(83,element83);
            result.add(84,element84);
            result.add(85,element85);
            result.add(86,element86);
            result.add(87,element87);
            result.add(88,element88);
            result.add(89,element89);
            result.add(90,element90);
            result.add(91,element91);
            result.add(92,element92);
            result.add(93,element93);
            result.add(94,element94);
            result.add(95,element95);
            result.add(96,element96);
            result.add(97,element97);
            result.add(98,element98);
            result.add(99,element99);
            result.add(100,element100);
            result.add(101,element101);
            result.add(102,element102);
            result.add(103,element103);
            result.add(104,element104);
            result.add(105,element105);
            result.add(106,element106);
            result.add(107,element107);
            result.add(108,element108);
            result.add(109,element109);
            result.add(110,element110);
            result.add(111,element111);
            result.add(112,element112);
            result.add(113,element113);
            result.add(114,element114);
            result.add(115,element115);
            result.add(116,element116);
            result.add(117,element117);
            result.add(118,element118);
            result.add(119,element119);
            result.add(120,element120);
            result.add(121,element121);
            result.add(122,element122);
            result.add(123,element123);
            result.add(124,element124);
            result.add(125,element125);
            result.add(126,element126);
            result.add(127,element127);
            result.add(128,element128);
            
            messageTypeCache.put(mti, result);
        }
        return result;
    }

}
