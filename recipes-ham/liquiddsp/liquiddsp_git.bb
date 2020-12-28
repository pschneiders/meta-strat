SUMMARY = "SDR"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=860e4083ceb93ce0939b1a58fcaacb53"

SRC_URI = "git://github.com/jgaeddert/liquid-dsp.git;protocol=git;branch=master \
          "

SRCREV = "c68f5e39434433c88bd4fe19784bf4c8a32aa8e4"

S = "${WORKDIR}/git"

inherit autotools-brokensep
INSANE_SKIP_${PN}-dev += "dev-elf"
