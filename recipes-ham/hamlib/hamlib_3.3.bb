SUMMARY = "Ham Radio Control Library"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/Hamlib/Hamlib.git;protocol=git;branch=Hamlib-3.3 \
          "

SRCREV = "301ebb92eaa538dfa75c06821f46715f40dd7673"

S = "${WORKDIR}/git"

inherit autotools

