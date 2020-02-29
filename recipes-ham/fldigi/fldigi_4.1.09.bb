SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "0f58d6a4b646c20991055c5e3fbc87d8"
SRC_URI[sha256sum] = "9753ef1377d395abaf462e1a51ed5665b192bb5bfa14608ee4067ba12caabcdd"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
