SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "acf60bbe0291cc0551ea8dbccce15c9c"
SRC_URI[sha256sum] = "260a61be714d9a7274adb78a822f210a589f4c344d5444c5f2cbbcd7c466ebbb"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
