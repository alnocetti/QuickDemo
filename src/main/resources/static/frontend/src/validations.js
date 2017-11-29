import validator from "validator";

const toString = value => value + '';

export default {
  notEmpty: arg => {
    if (Array.isArray(arg)) return arg.length > 0;
    return !validator.isEmpty(toString(arg));
  },
  isDate: arg => validator.toDate(toString(arg)) !== null,
  isEmail: validator.isEmail,
  isYear: arg => validator.isInt(toString(arg)) && arg > 2000 && arg <= 2017,
  isNot: not => arg => arg != not,

  validate: (obj, rules) => {
    const errors = {};

    Object
      .keys(rules)
      .forEach((key) => {
        rules[key].forEach(validation => {
          const ok = validation(obj[key]);
          if (!ok) {
            errors[key] = true;
          }
        });
      });

    return errors;
  },
};
