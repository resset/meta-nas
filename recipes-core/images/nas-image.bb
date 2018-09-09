DESCRIPTION = "NAS image based on poky/core-image-full-cmdline"

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    rng-tools \
    "

inherit core-image
