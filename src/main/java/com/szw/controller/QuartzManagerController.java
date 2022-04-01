DIRC      `��D' bG/�              ��           J;	�N9"��<9Ɉfѩ�g 
.gitignore        `�����bG/�              ��          �&h1�I��0M�
�5S�>�k� pom.xml   bG,�;3�bG,�              ��          +��C�*�H��p<��h`�ތ +src/main/java/com/szw/StaffApplication.java       `���-�D�`��              ��          X�=8�g����rFٜ�1l� *src/main/java/com/szw/common/RespBean.java        bG!�+��bG!�              ��          �X6��u6e»�C��Mh��� &src/main/java/com/szw/common/Test.java    `����� `��
              ��          ���>MVѾ�tX�3�i��R <src/main/java/com/szw/controller/BatchRateMngController.java      `����w�b@�              ��          ��<��`����ɋ/t2Z�_ 7src/main/java/com/szw/controller/BlogMngController.java   `��� ���b@�              ��          �
�M��(��q}y��(�u��= 6src/main/java/com/szw/controller/LoginServiceImpl.java    `���!���`�M�              ��          ��Vȁ�B7������(���� &src/main/java/com/szw/entity/Blog.java    `���z9�`��              ��          Z�Ś�ᶉ-�Е߇Ө��d� -src/main/java/com/szw/entity/BlogExample.java     `����(�bG/�              ��          Rx�F��r��e|$��'	� 'src/main/java/com/szw/entity/Model.java   `���4΀`��              ��          W����7U�f�{�*9s�gS &src/main/java/com/szw/entity/Sort.java    `���u* `��              ��          ��f��Z�HP���9~�7U��\ &src/main/java/com/szw/entity/User.java    `���p�`��              ��          .��-Dc�c�b#1�Д�}��!� -src/main/java/com/szw/entity/UserExample.java     b@�GX; bG/�              ��           �w;�RŅ���z:�ADV; 1src/main/java/com/szw/mapper/BatchRateMapper.java bG!�+��bG!�              ��          ���vFn������ܶBG�� 0src/main/java/com/szw/mapper/BatchRateMapper.xml  b@�G]J�bG/�              ��          �$P�����y�j�(�w
�u� )src/main/java/com/szw/mapper/BlogDao.java bG!�,� bG!�              ��          bK��r)Pͩ}��e͠7��{P� (src/main/java/com/szw/mapper/BlogDao.xml  b@�G
�� bG/�              ��          N�=��J�=�S�ȵ!�ߢ� )src/main/java/com/szw/mapper/UserDao.java bG!�,� bG!�              ��          �qr�T�HT���8�	L� (src/main/java/com/szw/mapper/UserDao.xml  `����� `��              ��           ��%�GU*E�C�8�l%�� 3src/main/java/com/szw/service/BatchRateService.java       `���N `��
              ��          ()�;?�'W~E�e����Og�� /src/main/java/com/szw/service/LoginService.java   `���) ��b@��              ��          �+ ���ܗ����rI#�L�� <src/main/java/com/szw/service/impl/BatchRateServiceImpl.java      b@�Lׄ bG/�              ��          ��^�j���G����{�q )src/main/resources/application.properties `���bZ `��              ��          <!E�{�	ӆ� x�K�5� #src/main/resources/mysql-config.xml       `���z9�`��
              ��          ����bv�Ђ��~���d� ?src/test/java/test/com/szw/comtroller/TestLoginServiceImpl.java   TREE  > 26 1
/���ǫ���_IG��:[b�src 24 2
�D��z�Y�[5��,�1	���main 23 2
�h
�]v����[,��&Lxjava 21 1
#��V��`JW<㷻1yN42�com 21 1
�v�� }�%<��i�	�x/szw 21 5
]��VC��Nn��6���}common 2 0
&��k(8�R�NO���W�Q�^entity 6 0
M�ԟ"_AAh����~�h(;mapper 6 0
�LV���34
]��.�Ǔ�*_service 3 1
����@w�@;L<G���%�impl 1 0
kw�ht�\��ћv#��/��controller 3 0
�E=vD��7�m�|�:��2Jresources 2 0
������<I�M�%7V�test 1 1
�w���(8�05�+5���Qjava 1 1
g��Lo�Ծ$��@����,نtest 1 1
dώ�8�b&#�E���o5�
�com 1 1
Į+�:���AH�T�y���X�szw 1 1
E��b]�ۨg����Y)�ڹ�comtroller 1 0
b�v-� ���R𮒾[�t]�X�[��k�ʤf                                                                                                                                                  eSize
     * @return
     */
    @GetMapping(value = "/queryjob")
    public Map<String, Object> queryjob(@RequestParam(value = "pageNum") Integer pageNum,
                                        @RequestParam(value = "pageSize") Integer pageSize) {
        PageInfo<JobDetails> jobAndTrigger = qtzManager.queryAllJobBean(pageNum, pageSize);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("JobAndTrigger", jobAndTrigger);
        map.put("number", jobAndTrigger.getTotal());
        return map;
    }

    @PostMapping(value = "/getAllByPaginationAndKeyword")
    public RespBean getAllByPaginationAndKeyWord(GetAllByPaginationAndKeywordVO vo) {
        System.out.println(vo);
        return RespBean.ok("SUCCESS");

    }
}
