## Scrimage Utils

Collection of filter plugins for the [Scrimage](https://github.com/sksamuel/scrimage) library.
It consists of various Dithering Filters, as listed below. Also the algorithm implementation allows for custom
error diffusion values and matrix dithering values.

Latest Release: 1.1

### Filters

### Error Diffusion Dithering

Click on the small images to see an enlarged example.

| Filter | Example 1 | Example 2 |
| ------ | --------- | --------- |
| floyd-steinberg | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_floyd-steinberg_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_floyd-steinberg_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_floyd-steinberg_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_floyd-steinberg_small.png'><a/> |
| jarvis-judice-ninke | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_jarvis-judice-ninke_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_jarvis-judice-ninke_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_jarvis-judice-ninke_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_jarvis-judice-ninke_small.png'><a/> |
| stucki | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_stucki_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_stucki_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_stucki_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_stucki_small.png'><a/> |
| atkinson | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_atkinson_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_atkinson_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_atkinson_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_atkinson_small.png'><a/> |
| burkes | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_burkes_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_burkes_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_burkes_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_burkes_small.png'><a/> |
| sierra-3 | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_sierra-3_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_sierra-3_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_sierra-3_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_sierra-3_small.png'><a/> |
| sierra-2 | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_sierra-2_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_sierra-2_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_sierra-2_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_sierra-2_small.png'><a/> |
| sierra-1 | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_sierra-1_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_sierra-1_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_sierra-1_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_sierra-1_small.png'><a/> |

### Matrix Dithering

Click on the small images to see an enlarged example.

| Filter | Example 1 | Example 2 |
| ------ | --------- | --------- |
| ordered4x4 | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_ordered4x4_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_ordered4x4_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_ordered4x4_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_ordered4x4_small.png'><a/> |
| ordered8x8 | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_ordered8x8_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_ordered8x8_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_ordered8x8_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_ordered8x8_small.png'><a/> |

### Other Dithering

Click on the small images to see an enlarged example.

| Filter | Example 1 | Example 2 |
| ------ | --------- | --------- |
| random | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_random_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/MacOSXDesktop_random_small.png'><a/> | <a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_random_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/CompanionCube_random_small.png'><a/> |

