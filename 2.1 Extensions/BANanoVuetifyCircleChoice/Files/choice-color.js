!(function (n, t) {
  "object" == typeof exports && "object" == typeof module
    ? (module.exports = t())
    : "function" == typeof define && define.amd
    ? define([], t)
    : "object" == typeof exports
    ? (exports["choice-color"] = t())
    : (n["choice-color"] = t());
})(this, function () {
  return (function (n) {
    function t(r) {
      if (e[r]) return e[r].exports;
      var o = (e[r] = { i: r, l: !1, exports: {} });
      return n[r].call(o.exports, o, o.exports, t), (o.l = !0), o.exports;
    }
    var e = {};
    return (
      (t.m = n),
      (t.c = e),
      (t.i = function (n) {
        return n;
      }),
      (t.d = function (n, e, r) {
        t.o(n, e) ||
          Object.defineProperty(n, e, {
            configurable: !1,
            enumerable: !0,
            get: r,
          });
      }),
      (t.n = function (n) {
        var e =
          n && n.__esModule
            ? function () {
                return n.default;
              }
            : function () {
                return n;
              };
        return t.d(e, "a", e), e;
      }),
      (t.o = function (n, t) {
        return Object.prototype.hasOwnProperty.call(n, t);
      }),
      (t.p = "/vue-circle-choice/"),
      t((t.s = 51))
    );
  })([
    function (n, t, e) {
      n.exports = !e(1)(function () {
        return (
          7 !=
          Object.defineProperty({}, "a", {
            get: function () {
              return 7;
            },
          }).a
        );
      });
    },
    function (n, t) {
      n.exports = function (n) {
        try {
          return !!n();
        } catch (n) {
          return !0;
        }
      };
    },
    function (n, t) {
      var e = (n.exports =
        "undefined" != typeof window && window.Math == Math
          ? window
          : "undefined" != typeof self && self.Math == Math
          ? self
          : Function("return this")());
      "number" == typeof __g && (__g = e);
    },
    function (n, t) {
      n.exports = function (n) {
        return "object" == typeof n ? null !== n : "function" == typeof n;
      };
    },
    function (n, t) {
      var e = (n.exports = { version: "2.4.0" });
      "number" == typeof __e && (__e = e);
    },
    function (n, t) {
      n.exports = function (n) {
        if (void 0 == n) throw TypeError("Can't call method on  " + n);
        return n;
      };
    },
    function (n, t, e) {
      var r = e(21);
      n.exports = Object("z").propertyIsEnumerable(0)
        ? Object
        : function (n) {
            return "String" == r(n) ? n.split("") : Object(n);
          };
    },
    function (n, t) {
      var e = Math.ceil,
        r = Math.floor;
      n.exports = function (n) {
        return isNaN((n = +n)) ? 0 : (n > 0 ? r : e)(n);
      };
    },
    function (n, t, e) {
      var r = e(6),
        o = e(5);
      n.exports = function (n) {
        return r(o(n));
      };
    },
    function (n, t) {
      n.exports = function () {
        var n = [];
        return (
          (n.toString = function () {
            for (var n = [], t = 0; t < this.length; t++) {
              var e = this[t];
              e[2] ? n.push("@media " + e[2] + "{" + e[1] + "}") : n.push(e[1]);
            }
            return n.join("");
          }),
          (n.i = function (t, e) {
            "string" == typeof t && (t = [[null, t, ""]]);
            for (var r = {}, o = 0; o < this.length; o++) {
              var i = this[o][0];
              "number" == typeof i && (r[i] = !0);
            }
            for (o = 0; o < t.length; o++) {
              var a = t[o];
              ("number" == typeof a[0] && r[a[0]]) ||
                (e && !a[2]
                  ? (a[2] = e)
                  : e && (a[2] = "(" + a[2] + ") and (" + e + ")"),
                n.push(a));
            }
          }),
          n
        );
      };
    },
    function (n, t) {
      n.exports = function (n, t, e, r) {
        var o,
          i = (n = n || {}),
          a = typeof n.default;
        ("object" !== a && "function" !== a) || ((o = n), (i = n.default));
        var s = "function" == typeof i ? i.options : i;
        if (
          (t &&
            ((s.render = t.render), (s.staticRenderFns = t.staticRenderFns)),
          e && (s._scopeId = e),
          r)
        ) {
          var c = s.computed || (s.computed = {});
          Object.keys(r).forEach(function (n) {
            var t = r[n];
            c[n] = function () {
              return t;
            };
          });
        }
        return { esModule: o, exports: i, options: s };
      };
    },
    function (n, t, e) {
      function r(n) {
        for (var t = 0; t < n.length; t++) {
          var e = n[t],
            r = l[e.id];
          if (r) {
            r.refs++;
            for (var o = 0; o < r.parts.length; o++) r.parts[o](e.parts[o]);
            for (; o < e.parts.length; o++) r.parts.push(a(e.parts[o]));
            r.parts.length > e.parts.length &&
              (r.parts.length = e.parts.length);
          } else {
            for (var i = [], o = 0; o < e.parts.length; o++)
              i.push(a(e.parts[o]));
            l[e.id] = { id: e.id, refs: 1, parts: i };
          }
        }
      }
      function o(n, t) {
        for (var e = [], r = {}, o = 0; o < t.length; o++) {
          var i = t[o],
            a = i[0],
            s = i[1],
            c = i[2],
            u = i[3],
            l = { css: s, media: c, sourceMap: u };
          r[a]
            ? ((l.id = n + ":" + r[a].parts.length), r[a].parts.push(l))
            : ((l.id = n + ":0"), e.push((r[a] = { id: a, parts: [l] })));
        }
        return e;
      }
      function i() {
        var n = document.createElement("style");
        return (n.type = "text/css"), f.appendChild(n), n;
      }
      function a(n) {
        var t,
          e,
          r = document.querySelector('style[data-vue-ssr-id~="' + n.id + '"]'),
          o = null != r;
        if (o && p) return v;
        if (h) {
          var a = d++;
          (r = A || (A = i())),
            (t = s.bind(null, r, a, !1)),
            (e = s.bind(null, r, a, !0));
        } else
          (r = r || i()),
            (t = c.bind(null, r)),
            (e = function () {
              r.parentNode.removeChild(r);
            });
        return (
          o || t(n),
          function (r) {
            if (r) {
              if (
                r.css === n.css &&
                r.media === n.media &&
                r.sourceMap === n.sourceMap
              )
                return;
              t((n = r));
            } else e();
          }
        );
      }
      function s(n, t, e, r) {
        var o = e ? "" : r.css;
        if (n.styleSheet) n.styleSheet.cssText = C(t, o);
        else {
          var i = document.createTextNode(o),
            a = n.childNodes;
          a[t] && n.removeChild(a[t]),
            a.length ? n.insertBefore(i, a[t]) : n.appendChild(i);
        }
      }
      function c(n, t) {
        var e = t.css,
          r = t.media,
          o = t.sourceMap;
        if (
          (r && n.setAttribute("media", r),
          o &&
            ((e += "\n/*# sourceURL=" + o.sources[0] + " */"),
            (e +=
              "\n/*# sourceMappingURL=data:application/json;base64," +
              btoa(unescape(encodeURIComponent(JSON.stringify(o)))) +
              " */")),
          n.styleSheet)
        )
          n.styleSheet.cssText = e;
        else {
          for (; n.firstChild; ) n.removeChild(n.firstChild);
          n.appendChild(document.createTextNode(e));
        }
      }
      var u = "undefined" != typeof document;
      if ("undefined" != typeof DEBUG && DEBUG && !u)
        throw new Error(
          "vue-style-loader cannot be used in a non-browser environment. Use { target: 'node' } in your Webpack config to indicate a server-rendering environment."
        );
      var o = e(50),
        l = {},
        f = u && (document.head || document.getElementsByTagName("head")[0]),
        A = null,
        d = 0,
        p = !1,
        v = function () {},
        h =
          "undefined" != typeof navigator &&
          /msie [6-9]\b/.test(navigator.userAgent.toLowerCase());
      n.exports = function (n, t, e) {
        p = e;
        var i = o(n, t);
        return (
          r(i),
          function (t) {
            for (var e = [], a = 0; a < i.length; a++) {
              var s = i[a],
                c = l[s.id];
              c.refs--, e.push(c);
            }
            t ? ((i = o(n, t)), r(i)) : (i = []);
            for (var a = 0; a < e.length; a++) {
              var c = e[a];
              if (0 === c.refs) {
                for (var u = 0; u < c.parts.length; u++) c.parts[u]();
                delete l[c.id];
              }
            }
          }
        );
      };
      var C = (function () {
        var n = [];
        return function (t, e) {
          return (n[t] = e), n.filter(Boolean).join("\n");
        };
      })();
    },
    function (n, t, e) {
      e(48);
      var r = e(10)(e(14), e(46), "data-v-4a468d22", null);
      n.exports = r.exports;
    },
    function (n, t, e) {
      e(49);
      var r = e(10)(e(15), e(47), "data-v-8e0279a6", null);
      n.exports = r.exports;
    },
    function (n, t, e) {
      "use strict";
      Object.defineProperty(t, "__esModule", { value: !0 });
      var r = ["#1ba6cc", "#189ba7", "#98c6ae", "#45a270"];
      t.default = {
        name: "choiceColor",
        data: function () {
          return { color: r[0] };
        },
        props: { colors: { default: r }, radius: { default: "10em" } },
        computed: {
          colorBg: function () {
            return { backgroundColor: this.color };
          },
          containerSize: function () {
            return {
              width: "calc(2 * " + this.radius + ")",
              height: "calc(2 * " + this.radius + ")",
            };
          },
        },
        methods: {
          setColor: function (n) {
            var t = this.colors.indexOf(n);
            (this.color = n), this.$emit("updateColor", { index: t, color: n });
          },
          setItem: function (n) {
            var t = (360 * n) / this.colors.length + "deg",
              e = 90 - 360 / this.colors.length + "deg";
            return {
              backgroundColor: this.colors[n],
              transform: "rotate(" + t + ") skew(" + e + ")",
            };
          },
        },
      };
    },
    function (n, t, e) {
      "use strict";
      Object.defineProperty(t, "__esModule", { value: !0 });
      var r = e(16),
        o = e.n(r);
      t.default = {
        name: "circularNav",
        data: function () {
          return { isOpen: !1, size: {} };
        },
        props: {
          navs: { type: Array, require: !0 },
          radius: { type: String, default: "10em" },
          color: { type: String, default: "#754481" },
        },
        computed: {
          colorT: function () {
            return {
              color: this.isOpen ? this.color : "#fff",
              backgroundColor: this.isOpen ? "#fff" : this.color,
            };
          },
          containerSize: function () {
            return o()(
              { bottom: "calc(-" + this.radius + " - 1px)" },
              this.size
            );
          },
          anchorStyle: function () {
            var n = "-" + (90 - 90 / this.navs.length) + "deg",
              t = "-" + (90 - 180 / this.navs.length) + "deg";
            return o()(
              {
                transform: "skew(" + t + ") rotate(" + n + ")",
                right: "-" + this.radius,
                bottom: "-" + this.radius,
              },
              this.size
            );
          },
          navTransform: function () {
            return {
              transform:
                "translateX(-50%) scale(" + (this.isOpen ? 1 : 0.01) + ")",
            };
          },
        },
        methods: {
          setNav: function (n) {
            this.$emit("updateNav", n);
          },
          setItem: function (n) {
            var t = (180 * n) / this.navs.length + "deg",
              e = 90 - 180 / this.navs.length + "deg";
            return {
              backgroundColor: this.color,
              transform: "rotate(" + t + ") skew(" + e + ")",
            };
          },
          toggle: function () {
            this.isOpen = !this.isOpen;
          },
        },
        created: function () {
          o()(this.size, {
            width: "calc(2 * " + this.radius + ")",
            height: "calc(2 * " + this.radius + ")",
          });
        },
      };
    },
    function (n, t, e) {
      n.exports = { default: e(17), __esModule: !0 };
    },
    function (n, t, e) {
      e(43), (n.exports = e(4).Object.assign);
    },
    function (n, t) {
      n.exports = function (n) {
        if ("function" != typeof n) throw TypeError(n + " is not a function!");
        return n;
      };
    },
    function (n, t, e) {
      var r = e(3);
      n.exports = function (n) {
        if (!r(n)) throw TypeError(n + " is not an object!");
        return n;
      };
    },
    function (n, t, e) {
      var r = e(8),
        o = e(39),
        i = e(38);
      n.exports = function (n) {
        return function (t, e, a) {
          var s,
            c = r(t),
            u = o(c.length),
            l = i(a, u);
          if (n && e != e) {
            for (; u > l; ) if (((s = c[l++]), s != s)) return !0;
          } else
            for (; u > l; l++)
              if ((n || l in c) && c[l] === e) return n || l || 0;
          return !n && -1;
        };
      };
    },
    function (n, t) {
      var e = {}.toString;
      n.exports = function (n) {
        return e.call(n).slice(8, -1);
      };
    },
    function (n, t, e) {
      var r = e(18);
      n.exports = function (n, t, e) {
        if ((r(n), void 0 === t)) return n;
        switch (e) {
          case 1:
            return function (e) {
              return n.call(t, e);
            };
          case 2:
            return function (e, r) {
              return n.call(t, e, r);
            };
          case 3:
            return function (e, r, o) {
              return n.call(t, e, r, o);
            };
        }
        return function () {
          return n.apply(t, arguments);
        };
      };
    },
    function (n, t, e) {
      var r = e(3),
        o = e(2).document,
        i = r(o) && r(o.createElement);
      n.exports = function (n) {
        return i ? o.createElement(n) : {};
      };
    },
    function (n, t) {
      n.exports = "constructor,hasOwnProperty,isPrototypeOf,propertyIsEnumerable,toLocaleString,toString,valueOf".split(
        ","
      );
    },
    function (n, t, e) {
      var r = e(2),
        o = e(4),
        i = e(22),
        a = e(27),
        s = "prototype",
        c = function (n, t, e) {
          var u,
            l,
            f,
            A = n & c.F,
            d = n & c.G,
            p = n & c.S,
            v = n & c.P,
            h = n & c.B,
            C = n & c.W,
            b = d ? o : o[t] || (o[t] = {}),
            m = b[s],
            g = d ? r : p ? r[t] : (r[t] || {})[s];
          d && (e = t);
          for (u in e)
            (l = !A && g && void 0 !== g[u]),
              (l && u in b) ||
                ((f = l ? g[u] : e[u]),
                (b[u] =
                  d && "function" != typeof g[u]
                    ? e[u]
                    : h && l
                    ? i(f, r)
                    : C && g[u] == f
                    ? (function (n) {
                        var t = function (t, e, r) {
                          if (this instanceof n) {
                            switch (arguments.length) {
                              case 0:
                                return new n();
                              case 1:
                                return new n(t);
                              case 2:
                                return new n(t, e);
                            }
                            return new n(t, e, r);
                          }
                          return n.apply(this, arguments);
                        };
                        return (t[s] = n[s]), t;
                      })(f)
                    : v && "function" == typeof f
                    ? i(Function.call, f)
                    : f),
                v &&
                  (((b.virtual || (b.virtual = {}))[u] = f),
                  n & c.R && m && !m[u] && a(m, u, f)));
        };
      (c.F = 1),
        (c.G = 2),
        (c.S = 4),
        (c.P = 8),
        (c.B = 16),
        (c.W = 32),
        (c.U = 64),
        (c.R = 128),
        (n.exports = c);
    },
    function (n, t) {
      var e = {}.hasOwnProperty;
      n.exports = function (n, t) {
        return e.call(n, t);
      };
    },
    function (n, t, e) {
      var r = e(30),
        o = e(35);
      n.exports = e(0)
        ? function (n, t, e) {
            return r.f(n, t, o(1, e));
          }
        : function (n, t, e) {
            return (n[t] = e), n;
          };
    },
    function (n, t, e) {
      n.exports =
        !e(0) &&
        !e(1)(function () {
          return (
            7 !=
            Object.defineProperty(e(23)("div"), "a", {
              get: function () {
                return 7;
              },
            }).a
          );
        });
    },
    function (n, t, e) {
      "use strict";
      var r = e(33),
        o = e(31),
        i = e(34),
        a = e(40),
        s = e(6),
        c = Object.assign;
      n.exports =
        !c ||
        e(1)(function () {
          var n = {},
            t = {},
            e = Symbol(),
            r = "abcdefghijklmnopqrst";
          return (
            (n[e] = 7),
            r.split("").forEach(function (n) {
              t[n] = n;
            }),
            7 != c({}, n)[e] || Object.keys(c({}, t)).join("") != r
          );
        })
          ? function (n, t) {
              for (
                var e = a(n), c = arguments.length, u = 1, l = o.f, f = i.f;
                c > u;

              )
                for (
                  var A,
                    d = s(arguments[u++]),
                    p = l ? r(d).concat(l(d)) : r(d),
                    v = p.length,
                    h = 0;
                  v > h;

                )
                  f.call(d, (A = p[h++])) && (e[A] = d[A]);
              return e;
            }
          : c;
    },
    function (n, t, e) {
      var r = e(19),
        o = e(28),
        i = e(41),
        a = Object.defineProperty;
      t.f = e(0)
        ? Object.defineProperty
        : function (n, t, e) {
            if ((r(n), (t = i(t, !0)), r(e), o))
              try {
                return a(n, t, e);
              } catch (n) {}
            if ("get" in e || "set" in e)
              throw TypeError("Accessors not supported!");
            return "value" in e && (n[t] = e.value), n;
          };
    },
    function (n, t) {
      t.f = Object.getOwnPropertySymbols;
    },
    function (n, t, e) {
      var r = e(26),
        o = e(8),
        i = e(20)(!1),
        a = e(36)("IE_PROTO");
      n.exports = function (n, t) {
        var e,
          s = o(n),
          c = 0,
          u = [];
        for (e in s) e != a && r(s, e) && u.push(e);
        for (; t.length > c; ) r(s, (e = t[c++])) && (~i(u, e) || u.push(e));
        return u;
      };
    },
    function (n, t, e) {
      var r = e(32),
        o = e(24);
      n.exports =
        Object.keys ||
        function (n) {
          return r(n, o);
        };
    },
    function (n, t) {
      t.f = {}.propertyIsEnumerable;
    },
    function (n, t) {
      n.exports = function (n, t) {
        return {
          enumerable: !(1 & n),
          configurable: !(2 & n),
          writable: !(4 & n),
          value: t,
        };
      };
    },
    function (n, t, e) {
      var r = e(37)("keys"),
        o = e(42);
      n.exports = function (n) {
        return r[n] || (r[n] = o(n));
      };
    },
    function (n, t, e) {
      var r = e(2),
        o = "__core-js_shared__",
        i = r[o] || (r[o] = {});
      n.exports = function (n) {
        return i[n] || (i[n] = {});
      };
    },
    function (n, t, e) {
      var r = e(7),
        o = Math.max,
        i = Math.min;
      n.exports = function (n, t) {
        return (n = r(n)), n < 0 ? o(n + t, 0) : i(n, t);
      };
    },
    function (n, t, e) {
      var r = e(7),
        o = Math.min;
      n.exports = function (n) {
        return n > 0 ? o(r(n), 9007199254740991) : 0;
      };
    },
    function (n, t, e) {
      var r = e(5);
      n.exports = function (n) {
        return Object(r(n));
      };
    },
    function (n, t, e) {
      var r = e(3);
      n.exports = function (n, t) {
        if (!r(n)) return n;
        var e, o;
        if (t && "function" == typeof (e = n.toString) && !r((o = e.call(n))))
          return o;
        if ("function" == typeof (e = n.valueOf) && !r((o = e.call(n))))
          return o;
        if (!t && "function" == typeof (e = n.toString) && !r((o = e.call(n))))
          return o;
        throw TypeError("Can't convert object to primitive value");
      };
    },
    function (n, t) {
      var e = 0,
        r = Math.random();
      n.exports = function (n) {
        return "Symbol(".concat(
          void 0 === n ? "" : n,
          ")_",
          (++e + r).toString(36)
        );
      };
    },
    function (n, t, e) {
      var r = e(25);
      r(r.S + r.F, "Object", { assign: e(29) });
    },
    function (n, t, e) {
      (t = n.exports = e(9)()),
        t.push([
          n.i,
          "\n*[data-v-4a468d22] {\n  box-sizing: border-box;\n}\nul[data-v-4a468d22] {\n  width: 100%;\n  height: 100%;\n  list-style: none;\n  padding: 0;\n  margin: 0;\n}\n.theme-container[data-v-4a468d22] {\n  position: absolute;\n  left: 50%;\n  top: 50%;\n  transform: translate(-50%, -50%);\n  width: 20em;\n  height: 20em;\n}\n.colors-container[data-v-4a468d22] {\n  width: 100%;\n  height: 100%;\n  position: absolute;\n  border-radius: 50%;\n  overflow: hidden;\n}\n.colors-container .color-block[data-v-4a468d22] {\n    width: 50%;\n    height: 50%;\n    position: absolute;\n    transform-origin: 100% 100%;\n    left: 50%;\n    top: 50%;\n    margin-left: -50%;\n    margin-top: -50%;\n    -webkit-tap-highlight-color: transparent;\n}\n.faux-border[data-v-4a468d22] {\n  position: absolute;\n  left: 50%;\n  top: 50%;\n  transform: translate(-50%, -50%);\n  width: 50%;\n  height: 50%;\n  border-radius: 50%;\n  padding: 5%;\n  background: #fff;\n}\n.chosen-color[data-v-4a468d22] {\n  width: 100%;\n  height: 100%;\n  border-radius: 50%;\n}\n",
          "",
          {
            version: 3,
            sources: ["/./src/components/choice-color.vue"],
            names: [],
            mappings:
              ";AACA;EACE,uBAAuB;CACxB;AACD;EACE,YAAY;EACZ,aAAa;EACb,iBAAiB;EACjB,WAAW;EACX,UAAU;CACX;AACD;EACE,mBAAmB;EACnB,UAAU;EACV,SAAS;EACT,iCAAiC;EACjC,YAAY;EACZ,aAAa;CACd;AACD;EACE,YAAY;EACZ,aAAa;EACb,mBAAmB;EACnB,mBAAmB;EACnB,iBAAiB;CAClB;AACD;IACI,WAAW;IACX,YAAY;IACZ,mBAAmB;IACnB,4BAA4B;IAC5B,UAAU;IACV,SAAS;IACT,kBAAkB;IAClB,iBAAiB;IACjB,yCAAyC;CAC5C;AACD;EACE,mBAAmB;EACnB,UAAU;EACV,SAAS;EACT,iCAAiC;EACjC,WAAW;EACX,YAAY;EACZ,mBAAmB;EACnB,YAAY;EACZ,iBAAiB;CAClB;AACD;EACE,YAAY;EACZ,aAAa;EACb,mBAAmB;CACpB",
            file: "choice-color.vue",
            sourcesContent: [
              "\n*[data-v-4a468d22] {\n  box-sizing: border-box;\n}\nul[data-v-4a468d22] {\n  width: 100%;\n  height: 100%;\n  list-style: none;\n  padding: 0;\n  margin: 0;\n}\n.theme-container[data-v-4a468d22] {\n  position: absolute;\n  left: 50%;\n  top: 50%;\n  transform: translate(-50%, -50%);\n  width: 20em;\n  height: 20em;\n}\n.colors-container[data-v-4a468d22] {\n  width: 100%;\n  height: 100%;\n  position: absolute;\n  border-radius: 50%;\n  overflow: hidden;\n}\n.colors-container .color-block[data-v-4a468d22] {\n    width: 50%;\n    height: 50%;\n    position: absolute;\n    transform-origin: 100% 100%;\n    left: 50%;\n    top: 50%;\n    margin-left: -50%;\n    margin-top: -50%;\n    -webkit-tap-highlight-color: transparent;\n}\n.faux-border[data-v-4a468d22] {\n  position: absolute;\n  left: 50%;\n  top: 50%;\n  transform: translate(-50%, -50%);\n  width: 50%;\n  height: 50%;\n  border-radius: 50%;\n  padding: 5%;\n  background: #fff;\n}\n.chosen-color[data-v-4a468d22] {\n  width: 100%;\n  height: 100%;\n  border-radius: 50%;\n}\n",
            ],
            sourceRoot: "webpack://",
          },
        ]);
    },
    function (n, t, e) {
      (t = n.exports = e(9)()),
        t.push([
          n.i,
          "\n*[data-v-8e0279a6] {\n  box-sizing: border-box;\n}\nul[data-v-8e0279a6] {\n  list-style: none;\n  padding: 0;\n  margin: 0;\n}\n.nav-wrapper[data-v-8e0279a6] {\n  position: fixed;\n  left: 50%;\n  transition: all .3s ease;\n  margin: auto;\n  overflow: hidden;\n  color: #fff;\n  background-color: #fff;\n  border-radius: 50%;\n  z-index: 10;\n}\n.nav-tabbar[data-v-8e0279a6] {\n  width: 100%;\n  height: 100%;\n  position: absolute;\n  border-radius: 50%;\n  overflow: hidden;\n}\n.nav-tabbar .nav-item[data-v-8e0279a6] {\n    width: 50%;\n    height: 50%;\n    position: absolute;\n    transform-origin: 100% 100%;\n    left: 50%;\n    top: 50%;\n    margin-left: -50%;\n    margin-top: -50%;\n    -webkit-tap-highlight-color: transparent;\n    overflow: hidden;\n    border: 1px solid #fff;\n    transition: border .3s ease;\n}\n.nav-tabbar .nav-item a[data-v-8e0279a6] {\n      display: block;\n      position: absolute;\n      padding-top: 25%;\n      text-decoration: none;\n      color: #fff;\n}\n.nav-tabbar .nav-item a .nav-item-label[data-v-8e0279a6] {\n        font-size: 0.8em;\n}\n.nav-tabbar .nav-item a .iconfont[data-v-8e0279a6] {\n        display: block;\n        font-size: 1.4em;\n}\n.nav-toggle[data-v-8e0279a6] {\n  font-size: 1em;\n  position: fixed;\n  bottom: -1.5em;\n  left: 50%;\n  transform: translateX(-50%);\n  width: 3em;\n  height: 3em;\n  padding-top: 0.3em;\n  border-radius: 50%;\n  background-color: #fff;\n  transition: all .3s ease;\n  z-index: 11;\n}\n.nav-overlay[data-v-8e0279a6] {\n  width: 100%;\n  height: 100%;\n  background-color: rgba(0, 0, 0, 0.6);\n  position: fixed;\n  top: 0;\n  left: 0;\n  bottom: 0;\n  right: 0;\n  opacity: 0;\n  visibility: hidden;\n  transition: all .3s ease;\n  z-index: 2;\n}\n.nav-overlay.on-overlay[data-v-8e0279a6] {\n    visibility: visible;\n    opacity: 1;\n}\n",
          "",
          {
            version: 3,
            sources: ["/./src/components/circular-nav.vue"],
            names: [],
            mappings:
              ";AACA;EACE,uBAAuB;CACxB;AACD;EACE,iBAAiB;EACjB,WAAW;EACX,UAAU;CACX;AACD;EACE,gBAAgB;EAChB,UAAU;EACV,yBAAyB;EACzB,aAAa;EACb,iBAAiB;EACjB,YAAY;EACZ,uBAAuB;EACvB,mBAAmB;EACnB,YAAY;CACb;AACD;EACE,YAAY;EACZ,aAAa;EACb,mBAAmB;EACnB,mBAAmB;EACnB,iBAAiB;CAClB;AACD;IACI,WAAW;IACX,YAAY;IACZ,mBAAmB;IACnB,4BAA4B;IAC5B,UAAU;IACV,SAAS;IACT,kBAAkB;IAClB,iBAAiB;IACjB,yCAAyC;IACzC,iBAAiB;IACjB,uBAAuB;IACvB,4BAA4B;CAC/B;AACD;MACM,eAAe;MACf,mBAAmB;MACnB,iBAAiB;MACjB,sBAAsB;MACtB,YAAY;CACjB;AACD;QACQ,iBAAiB;CACxB;AACD;QACQ,eAAe;QACf,iBAAiB;CACxB;AACD;EACE,eAAe;EACf,gBAAgB;EAChB,eAAe;EACf,UAAU;EACV,4BAA4B;EAC5B,WAAW;EACX,YAAY;EACZ,mBAAmB;EACnB,mBAAmB;EACnB,uBAAuB;EACvB,yBAAyB;EACzB,YAAY;CACb;AACD;EACE,YAAY;EACZ,aAAa;EACb,qCAAqC;EACrC,gBAAgB;EAChB,OAAO;EACP,QAAQ;EACR,UAAU;EACV,SAAS;EACT,WAAW;EACX,mBAAmB;EACnB,yBAAyB;EACzB,WAAW;CACZ;AACD;IACI,oBAAoB;IACpB,WAAW;CACd",
            file: "circular-nav.vue",
            sourcesContent: [
              "\n*[data-v-8e0279a6] {\n  box-sizing: border-box;\n}\nul[data-v-8e0279a6] {\n  list-style: none;\n  padding: 0;\n  margin: 0;\n}\n.nav-wrapper[data-v-8e0279a6] {\n  position: fixed;\n  left: 50%;\n  transition: all .3s ease;\n  margin: auto;\n  overflow: hidden;\n  color: #fff;\n  background-color: #fff;\n  border-radius: 50%;\n  z-index: 10;\n}\n.nav-tabbar[data-v-8e0279a6] {\n  width: 100%;\n  height: 100%;\n  position: absolute;\n  border-radius: 50%;\n  overflow: hidden;\n}\n.nav-tabbar .nav-item[data-v-8e0279a6] {\n    width: 50%;\n    height: 50%;\n    position: absolute;\n    transform-origin: 100% 100%;\n    left: 50%;\n    top: 50%;\n    margin-left: -50%;\n    margin-top: -50%;\n    -webkit-tap-highlight-color: transparent;\n    overflow: hidden;\n    border: 1px solid #fff;\n    transition: border .3s ease;\n}\n.nav-tabbar .nav-item a[data-v-8e0279a6] {\n      display: block;\n      position: absolute;\n      padding-top: 25%;\n      text-decoration: none;\n      color: #fff;\n}\n.nav-tabbar .nav-item a .nav-item-label[data-v-8e0279a6] {\n        font-size: 0.8em;\n}\n.nav-tabbar .nav-item a .iconfont[data-v-8e0279a6] {\n        display: block;\n        font-size: 1.4em;\n}\n.nav-toggle[data-v-8e0279a6] {\n  font-size: 1em;\n  position: fixed;\n  bottom: -1.5em;\n  left: 50%;\n  transform: translateX(-50%);\n  width: 3em;\n  height: 3em;\n  padding-top: 0.3em;\n  border-radius: 50%;\n  background-color: #fff;\n  transition: all .3s ease;\n  z-index: 11;\n}\n.nav-overlay[data-v-8e0279a6] {\n  width: 100%;\n  height: 100%;\n  background-color: rgba(0, 0, 0, 0.6);\n  position: fixed;\n  top: 0;\n  left: 0;\n  bottom: 0;\n  right: 0;\n  opacity: 0;\n  visibility: hidden;\n  transition: all .3s ease;\n  z-index: 2;\n}\n.nav-overlay.on-overlay[data-v-8e0279a6] {\n    visibility: visible;\n    opacity: 1;\n}\n",
            ],
            sourceRoot: "webpack://",
          },
        ]);
    },
    function (n, t) {
      n.exports = {
        render: function () {
          var n = this,
            t = n.$createElement,
            e = n._self._c || t;
          return e(
            "div",
            { staticClass: "theme-container", style: n.containerSize },
            [
              e(
                "ul",
                { staticClass: "colors-container" },
                n._l(n.colors, function (t, r) {
                  return e("li", {
                    staticClass: "color-block",
                    style: n.setItem(r),
                    on: {
                      click: function (e) {
                        n.setColor(t);
                      },
                    },
                  });
                })
              ),
              e("div", { staticClass: "faux-border" }, [
                e("div", { staticClass: "chosen-color", style: n.colorBg }),
              ]),
            ]
          );
        },
        staticRenderFns: [],
      };
    },
    function (n, t) {
      n.exports = {
        render: function () {
          var n = this,
            t = n.$createElement,
            e = n._self._c || t;
          return e("div", { staticClass: "nav-container" }, [
            e(
              "div",
              {
                staticClass: "nav-wrapper",
                style: [n.containerSize, n.navTransform],
              },
              [
                e(
                  "ul",
                  { staticClass: "nav-tabbar" },
                  n._l(n.navs, function (t, r) {
                    return e(
                      "li",
                      {
                        staticClass: "nav-item",
                        style: n.setItem(r),
                        on: {
                          click: function (t) {
                            n.setNav(r);
                          },
                        },
                      },
                      [
                        e(
                          "a",
                          {
                            style: n.anchorStyle,
                            attrs: { href: t.href || "javascript:void(0)" },
                          },
                          [
                            t.icon
                              ? e("span", {
                                  staticClass: "iconfont",
                                  class: t.icon,
                                })
                              : n._e(),
                            t.label
                              ? e("span", { staticClass: "nav-item-label" }, [
                                  n._v(n._s(t.label)),
                                ])
                              : n._e(),
                          ]
                        ),
                      ]
                    );
                  })
                ),
              ]
            ),
            e(
              "div",
              {
                staticClass: "nav-toggle",
                style: n.colorT,
                on: { click: n.toggle },
              },
              [n._v(n._s(n.isOpen ? "-" : "+"))]
            ),
            e("div", {
              staticClass: "nav-overlay",
              class: n.isOpen ? "on-overlay" : "",
              on: { click: n.toggle },
            }),
          ]);
        },
        staticRenderFns: [],
      };
    },
    function (n, t, e) {
      var r = e(44);
      "string" == typeof r && (r = [[n.i, r, ""]]),
        r.locals && (n.exports = r.locals);
      e(11)("dba03df0", r, !0);
    },
    function (n, t, e) {
      var r = e(45);
      "string" == typeof r && (r = [[n.i, r, ""]]),
        r.locals && (n.exports = r.locals);
      e(11)("355a0b75", r, !0);
    },
    function (n, t) {
      n.exports = function (n, t) {
        for (var e = [], r = {}, o = 0; o < t.length; o++) {
          var i = t[o],
            a = i[0],
            s = i[1],
            c = i[2],
            u = i[3],
            l = { id: n + ":" + o, css: s, media: c, sourceMap: u };
          r[a] ? r[a].parts.push(l) : e.push((r[a] = { id: a, parts: [l] }));
        }
        return e;
      };
    },
    function (n, t, e) {
      "use strict";
      Object.defineProperty(t, "__esModule", { value: !0 });
      var r = e(12),
        o = e.n(r),
        i = e(13),
        a = e.n(i);
      e.d(t, "choiceColor", function () {
        return o.a;
      }),
        e.d(t, "circularNav", function () {
          return a.a;
        }),
        (t.default = { choiceColor: o.a, circularNav: a.a });
    },
  ]);
});
