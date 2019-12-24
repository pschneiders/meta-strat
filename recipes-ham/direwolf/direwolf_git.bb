SUMMARY = "SDR"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE-dire-wolf.txt;md5=fa22e16ebbe6638b2bd253338fbded9f"

SRC_URI = "git://github.com/wb2osz/direwolf.git;protocol=git;branch=master \
           file://0001-Update-makefile.patch \
          "

SRCREV = "a1e2d1c3a88723e41efaf44a10f6374e6dfdd8df"

S = "${WORKDIR}/git"

DEPENDS = "alsa-lib udev"
RDEPENDS_${PN} = "bash perl python"

do_install() {
	DESTDIR=${D}/usr make install
	rm -rf ${D}/usr/etc
}
