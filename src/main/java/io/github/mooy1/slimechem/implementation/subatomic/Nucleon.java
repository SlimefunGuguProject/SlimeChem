package io.github.mooy1.slimechem.implementation.subatomic;

import io.github.mooy1.slimechem.implementation.atomic.DecayProduct;
import io.github.mooy1.slimechem.implementation.atomic.Element;
import io.github.mooy1.slimechem.utils.Util;
import lombok.Getter;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

import javax.annotation.Nonnull;

/**
 * Enum of nucleons
 *
 * @author Mooy1
 * @see Element
 * @see Quark
 */
@Getter
public enum Nucleon implements DecayProduct {

    NEUTRON(Quark.UP, Quark.DOWN, Quark.DOWN),
    PROTON(Quark.UP, Quark.UP, Quark.DOWN);

    private final Quark[] quarks;
    private final SlimefunItemStack item;

    Nucleon(@Nonnull Quark... quarks) {
        this.quarks = quarks;

        String name = this.toString();
        this.item = new SlimefunItemStack(
            name,
            Material.WHITE_DYE,
            "&7" + Util.enumNameToTitleCaseString(name),
            "&7Type: nucleon",
            "&7This particle does not interact via the strong force"
        );
    }

}
