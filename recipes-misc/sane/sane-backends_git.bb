SUMMARY = "SANE"
DESCRIPTION = "SANE - Scanner Access Now Easy"
LICENSE = "GPLv2"

SRC_URI = "git://gitlab.com/sane-project/backends.git;protocol=https;branch=master"
SRCREV = "9f461060aac2c6517e471699a7efa7e254b8048d"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

S = "${WORKDIR}/git"

INSANE_SKIP_${PN} = "dev-so"
FILES_${PN} += "\
	/usr/share/sane/ \
	/usr/lib/sane/ \
	"

inherit autotools gettext
