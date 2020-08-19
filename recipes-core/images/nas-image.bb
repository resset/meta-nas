DESCRIPTION = "NAS image based on poky/core-image-full-cmdline"

IMAGE_FEATURES += "ssh-server-openssh hwcodecs package-management"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    rng-tools \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    usbutils \
    cryptsetup \
    "

inherit core-image
