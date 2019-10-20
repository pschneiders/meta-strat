SUMMARY = "SANE"
DESCRIPTION = "SANE - Scanner Access Now Easy"
LICENSE = "GPLv2"

SRC_URI = "git://gitlab.com/sane-project/backends.git;protocol=https;branch=master"
SRCREV = "4354fc7f6da2ee65cbe940a715f11abecdad3f49"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

DEPENDS = "gettext-native"
S = "${WORKDIR}/git"

INSANE_SKIP_${PN} = "dev-so"
FILES_${PN} += "\
	/usr/share/sane/* \
	/usr/lib/sane/ * \
	" 

inherit autotools
