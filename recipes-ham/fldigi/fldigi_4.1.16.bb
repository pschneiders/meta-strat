SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "

SRC_URI[md5sum] = "bbc8c0ea59ba1353e239632abc09e653"
SRC_URI[sha256sum] = "640e3ea544adc7696e18cb08ed311ae1971ed18c609c39b55fb3c40c34dcd3b5"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
