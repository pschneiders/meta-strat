SUMMARY = "SDR"

LICENSE = "BOOSTv1"
LIC_FILES_CHKSUM = "file://LICENSE_1_0.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

SRCREV = "cafa4ba52c3eb1eb77f3532e834217a953584b87"
SRC_URI = "git://github.com/pothosware/SoapySDR.git;protocol=git;branch=master \
          "

S = "${WORKDIR}/git"

inherit cmake

