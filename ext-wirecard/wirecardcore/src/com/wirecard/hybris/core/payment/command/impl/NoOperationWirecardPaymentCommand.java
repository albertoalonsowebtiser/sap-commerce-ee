/*
 * Shop System Plugins - Terms of Use
 *
 * The plugins offered are provided free of charge by Wirecard AG and are explicitly not part
 * of the Wirecard AG range of products and services.
 *
 * They have been tested and approved for full functionality in the standard configuration
 * (status on delivery) of the corresponding shop system. They are under MIT license
 * and can be used, developed and passed on to third parties under
 * the same terms.
 *
 * However, Wirecard AG does not provide any guarantee or accept any liability for any errors
 * occurring when used in an enhanced, customized shop system configuration.
 *
 * Operation in an enhanced, customized configuration is at your own risk and requires a
 * comprehensive test phase by the user of the plugin.
 *
 * Customers use the plugins at their own risk. Wirecard AG does not guarantee their full
 * functionality neither does Wirecard AG assume liability for any disadvantages related to
 * the use of the plugins. Additionally, Wirecard AG does not guarantee the full functionality
 * for customized shop systems or installed plugins of other vendors of plugins within the same
 * shop system.
 *
 * Customers are responsible for testing the plugin's functionality before starting productive
 * operation.
 *
 * By installing the plugin into the shop system the customer agrees to these terms of use.
 * Please do not use the plugin if you do not agree to these terms of use!
 */
package com.wirecard.hybris.core.payment.command.impl;

import com.wirecard.hybris.core.data.types.Payment;
import com.wirecard.hybris.core.model.WirecardAuthenticationModel;
import com.wirecard.hybris.core.payment.command.PaymentCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NoOperationWirecardPaymentCommand implements PaymentCommand {

    private static final Logger LOG = LoggerFactory.getLogger(NoOperationWirecardPaymentCommand.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public Payment execute(Payment payment, WirecardAuthenticationModel wirecardAuthenticationModel) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Not executing any command and will return passed payment (Transacition-ID: {})", payment.getTransactionId());
        }
        return payment;
    }
}
