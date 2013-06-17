
DesignGridLayout integration
----------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/designgridlayout](http://artifacts.griffon-framework.org/plugin/designgridlayout)


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

