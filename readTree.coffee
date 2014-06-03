fs = require('fs')

readFileTree = require('readfiletree')

get = (cb) ->
  readFileTree 'comparisons/', (err, tree) ->
    if err
      cb(err)
      return

    out = {}
    order = ""

    for title, comps of tree
      if title is 'order.txt'
        order = comps.trim().split('\n')
      else
        out[title] = {}
        for name, comp of comps
          if name is 'alternatives.txt'
            name = '_alternatives'
          if name is 'order.txt'
            name = '_order'

          out[title][name] = {}

          if typeof comp isnt 'string'
            for filename, code of comp
              [version, ext] = filename.split '.'

              out[title][name][version] ?= {}
              out[title][name][version][ext] = code
          else
            out[title][name] = comp

    cb null, out, order

module.exports = get
