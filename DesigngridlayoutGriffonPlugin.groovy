/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class DesigngridlayoutGriffonPlugin {
    // the plugin version
    String version = '1.1.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-designGridlayout-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'DesignGridLayout integration'
    String description = '''
Provides integration with [DesignGridLayout][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*           | *Type*                                           |
| ---------------- | ------------------------------------------------ |
| designGridLayout | `net.java.dev.designgridlayout.DesignGridLayout` |

You must either nest `designGridLayout` inside a `Container` or provide a `Container` reference as the node's value.
All DesignGridLayout methods can be nested inside the node's child closure.

### Example

The following example is taken from DesignGridlayout's [usage][2] page.

    application(title: 'Griffon + DesignGridLayout',
      //size: [480, 320],
      pack: true,
      locationByPlatform:true,
      iconImage: imageIcon('/griffon-icon-48x48.png').image,
      iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                   imageIcon('/griffon-icon-32x32.png').image,
                   imageIcon('/griffon-icon-16x16.png').image]) {
        designGridLayout {
            row().grid(label('Row 1')).add(button('Button'), button('Button'))
            row().grid(label('Row 2')).add(button('Button'), button('Button'), button('Button'))
            row().grid(label('Row 3')).add(button('Button'), 2).add(button('Button'))
            row().grid(label('Row 4')).add(button('Button'), button('Button'), button('Button')).empty()
            emptyRow()
            row().right().add(button('Cancel'), button('OK'))
        }
    }

[1]: https://designgridlayout.dev.java.net/
[2]: https://designgridlayout.dev.java.net/nonav/site/usage.html
'''
}
